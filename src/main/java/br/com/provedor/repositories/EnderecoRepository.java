package br.com.provedor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.provedor.domain.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, String> {

}
