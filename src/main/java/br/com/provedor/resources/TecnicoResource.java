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

import br.com.provedor.domain.Tecnico;
import br.com.provedor.services.TecnicoService;

@RestController
@RequestMapping(value = "/tecnicos")
public class TecnicoResource {

	@Autowired
	private TecnicoService tecnicoService;
	
	@RequestMapping(value = "/{cpf}", method = RequestMethod.GET)
	public ResponseEntity<?> buscar(@PathVariable String cpf) {
		Tecnico tecnico = tecnicoService.buscar(cpf);
		return ResponseEntity.ok().body(tecnico);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> salvar(@RequestBody Tecnico tecnico) {
		tecnico = tecnicoService.salvar(tecnico);
		URI uri = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{cpf}")
				.buildAndExpand(tecnico.getCpf())
				.toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value = "/{cpf}", method = RequestMethod.PUT)
	public ResponseEntity<?> atualizar(@PathVariable String cpf, @RequestBody Tecnico tecnico) {
		tecnico.setCpf(cpf);
		tecnico = tecnicoService.atualizar(tecnico);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value = "/{cpf}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deletar(@PathVariable String cpf){
		tecnicoService.deletar(cpf);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> listar(){
		List<Tecnico> lista = tecnicoService.listar();
		return ResponseEntity.ok().body(lista);
	}

}