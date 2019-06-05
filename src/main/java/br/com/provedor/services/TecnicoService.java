package br.com.provedor.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.provedor.domain.Tecnico;
import br.com.provedor.repositories.TecnicoRepository;
import br.com.provedor.services.exceptions.ObjectNotFoundException;

@Service
public class TecnicoService {
		
		@Autowired
		private TecnicoRepository tecnicoRepository;

		public Tecnico buscar(String cpf) {
			Optional<Tecnico> obj = tecnicoRepository.findById(cpf);
			return obj.orElseThrow(() -> new ObjectNotFoundException("Técnico não encontrado! CPF: " + cpf));
		}

		public Tecnico salvar(Tecnico tecnico) {
			tecnico.setCpf(null);
			return tecnicoRepository.save(tecnico);
		}
		
		public Tecnico atualizar(Tecnico tecnico) {
			return tecnicoRepository.saveAndFlush(tecnico);
		}
		
		public void deletar(String cpf) {
			tecnicoRepository.deleteById(cpf);
		}
		
		public List<Tecnico> listar(){
			return tecnicoRepository.findAll();
		}
		
}