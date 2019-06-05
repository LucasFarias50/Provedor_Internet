package br.com.provedor.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.provedor.domain.Plano;
import br.com.provedor.repositories.PlanoRepository;
import br.com.provedor.services.exceptions.ObjectNotFoundException;

@Service
public class PlanoService {

	@Autowired
	private PlanoRepository planoRepository;

	public Plano buscar(Integer codigo) {
		Optional<Plano> obj = planoRepository.findById(codigo);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Plano não encontrado! Plano: " + codigo));
	}

	public Plano salvar(Plano plano) {
		plano.setCodigo(null);
		return planoRepository.save(plano);
	}
	
	public Plano atualizar(Plano plano) {
		return planoRepository.saveAndFlush(plano);
	}
	
	public void deletar(Integer codigo) {
		planoRepository.deleteById(codigo);
	}
	
	public List<Plano> listar(){
		return planoRepository.findAll();
	}
		
}