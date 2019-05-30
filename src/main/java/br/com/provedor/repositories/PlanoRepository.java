package br.com.provedor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.provedor.domain.Plano;

@Repository
public interface PlanoRepository extends JpaRepository <Plano, Integer> {

}
