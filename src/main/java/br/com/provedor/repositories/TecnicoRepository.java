package br.com.provedor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.provedor.domain.Tecnico;

@Repository
public interface TecnicoRepository extends JpaRepository<Tecnico, String> {

}
