package br.com.provedor.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.provedor.domain.Endereco;
import br.com.provedor.repositories.EnderecoRepository;
import br.com.provedor.services.exceptions.ObjectNotFoundException;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;

	public Endereco buscar(Integer codigo) {
		Optional<Endereco> obj = enderecoRepository.findById(codigo);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Endereço não encontrado! Endereço: " + codigo));
	}

	public Endereco salvar(Endereco endereco) {
		endereco.setCodigo(null);
		return enderecoRepository.save(endereco);
	}
	
	public Endereco atualizar(Endereco endereco) {
		return enderecoRepository.saveAndFlush(endereco);
	}
	
	public void deletar(Integer codigo) {
		enderecoRepository.deleteById(codigo);
	}
	
	public List<Endereco> listar(){
		return enderecoRepository.findAll();
	}
		
}