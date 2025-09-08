package br.senac.faculdade;

import org.springframework.beans.factory.annotation.Autowired; //injeta dependencias automaticamente
import org.springframework.boot.CommandLineRunner; //interface do Spring que permite rodar código logo após a aplicação iniciar
import org.springframework.boot.SpringApplication; //inicia a aplicação Spring Boot
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class FaculdadeApplication implements CommandLineRunner { //implements CommandLineRunner faz com que essa classe execute codigo automaricamente após a aplicação iniciar

    //main
	public static void main(String[] args) {
        SpringApplication.run(FaculdadeApplication.class, args); //SpringApplication.run inicia o contexto do spring(carrega as configs, conecta ao banco, inicia servior embutido como tomcat)
	}

    @Override
    public void run(String... args) throws Exception {
    }
}
