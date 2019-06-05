package br.com.provedor.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.provedor.domain.Cliente;
import br.com.provedor.repositories.ClienteRepository;
import br.com.provedor.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;

	public Cliente buscar(String cpf) {
		Optional<Cliente> obj = clienteRepository.findById(cpf);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Cliente não encontrado! CPF: " + cpf));
	}

	public Cliente salvar(Cliente cliente) {
		cliente.setCpf(null);
		return clienteRepository.save(cliente);
	}
	
	public Cliente atualizar(Cliente cliente) {
		return clienteRepository.saveAndFlush(cliente);
	}
	
	public void deletar(String cpf) {
		clienteRepository.deleteById(cpf);
	}
	
	public List<Cliente> listar(){
		return clienteRepository.findAll();
	}
	
}