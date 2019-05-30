package br.com.provedor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.provedor.domain.Cliente;
import br.com.provedor.domain.Pessoa;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Pessoa>{
}
