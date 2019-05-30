package br.com.provedor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.provedor.domain.Pessoa;
import br.com.provedor.domain.Cliente;
import br.com.provedor.domain.Tecnico;
import br.com.provedor.domain.Plano;
import br.com.provedor.domain.Endereco;
import br.com.provedor.domain.Pagamento;

import br.com.provedor.repositories.PessoaRepository;
import br.com.provedor.repositories.ClienteRepository;
import br.com.provedor.repositories.TecnicoRepository;
import br.com.provedor.repositories.PlanoRepository;
import br.com.provedor.repositories.EnderecoRepository;
import br.com.provedor.repositories.PagamentoRepository;

@SpringBootApplication
public class ProvedorApplication implements CommandLineRunner {

	@Autowired
	private ClienteRepository ClienteRep;
	
	@Autowired
	private EnderecoRepository EnderecoRep;
	
	@Autowired
	private PagamentoRepository PagamentoRep;
	
	@Autowired
	private PessoaRepository PessoaRep;
	
	@Autowired
	private PlanoRepository PlanoRep;
	
	@Autowired
	private TecnicoRepository TecnicoRep;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
		
	
	
	
}
