package br.com.provedor.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.provedor.domain.Plano;
import br.com.provedor.services.PlanoService;

@RestController
@RequestMapping(value = "/planos")
public class PlanoResource {

	@Autowired
	private PlanoService planoService;
	
	@RequestMapping(value = "/{codigo}", method = RequestMethod.GET)
	public ResponseEntity<?> buscar(@PathVariable Integer codigo) {
		Plano plano = planoService.buscar(codigo);
		return ResponseEntity.ok().body(plano);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> salvar(@RequestBody Plano plano) {
		plano = planoService.salvar(plano);
		URI uri = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{codigo}")
				.buildAndExpand(plano.getCodigo())
				.toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value = "/{codigo}", method = RequestMethod.PUT)
	public ResponseEntity<?> atualizar(@PathVariable Integer codigo, @RequestBody Plano plano) {
		plano.setCodigo(codigo);
		plano = planoService.atualizar(plano);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value = "/{codigo}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deletar(@PathVariable Integer codigo){
		planoService.deletar(codigo);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> listar(){
		List<Plano> lista = planoService.listar();
		return ResponseEntity.ok().body(lista);
	}

}