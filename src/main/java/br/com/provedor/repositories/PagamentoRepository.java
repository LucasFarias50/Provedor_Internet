package br.com.provedor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.provedor.domain.Pagamento;;

@Repository
public interface PagamentoRepository extends JpaRepository <Pagamento, Float>{

}
