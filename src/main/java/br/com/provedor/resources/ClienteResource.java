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

import br.com.provedor.services.ClienteService;
import br.com.provedor.domain.Cliente;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping(value = "/{cpf}", method = RequestMethod.GET)
	public ResponseEntity<?> buscar(@PathVariable String cpf) {
		Cliente cliente = clienteService.buscar(cpf);
		return ResponseEntity.ok().body(cliente);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> salvar(@RequestBody Cliente cliente) {
		cliente = clienteService.salvar(cliente);
		URI uri = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{cpf}")
				.buildAndExpand(cliente.getCpf())
				.toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value = "/{cpf}", method = RequestMethod.PUT)
	public ResponseEntity<?> atualizar(@PathVariable String cpf, @RequestBody Cliente cliente) {
		cliente.setCpf(cpf);
		cliente = clienteService.atualizar(cliente);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value = "/{cpf}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deletar(@PathVariable String cpf){
		clienteService.deletar(cpf);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> listar(){
		List<Cliente> lista = clienteService.listar();
		return ResponseEntity.ok().body(lista);
	}

}