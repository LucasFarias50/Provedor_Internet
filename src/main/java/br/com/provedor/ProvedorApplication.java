package br.com.provedor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.provedor.domain.*;
import br.com.provedor.repositories.*;

@SpringBootApplication
public class ProvedorApplication implements CommandLineRunner {

	@Autowired
	private ClienteRepository clienteRep;
	
	@Autowired
	private EnderecoRepository enderecoRep;
	
	@Autowired
	private PlanoRepository planoRep;
	
	@Autowired
	private TecnicoRepository tecnicoRep;
	
	public static void main(String[] args) {
		SpringApplication.run(ProvedorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Plano plano1 = new Plano();
		plano1.setNome("20 MB/s");
		plano1.setVelocidade(20);
		
		planoRep.save(plano1);
		
		Endereco endereco1 = new Endereco();
		endereco1.setBairro("Petropolis");
		endereco1.setCep("55131-211");
		endereco1.setCidade("Caruaru");
		endereco1.setLogradouro("Rua Antenor Navarro");
		endereco1.setNumero(590);
		
		enderecoRep.save(endereco1);
		
		Cliente cliente1 = new Cliente();
		cliente1.setCpf("112.380.124-26");
		cliente1.setNome("Geraldo de Rivia");
		cliente1.setEndereco(endereco1);
		cliente1.setPlano(plano1);
		
		clienteRep.save(cliente1);
		
		Tecnico tecnico1 = new Tecnico();
		tecnico1.setNome("Mario do gato");
		tecnico1.setCpf("574.284.212-45");
		tecnico1.setCliente(cliente1);
		
		tecnicoRep.save(tecnico1);
		
	}

}
