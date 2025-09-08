package br.senac.faculdade.services;

import br.senac.faculdade.entities.Aluno;
import br.senac.faculdade.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

@Service
public class DBService {
    @Autowired //permite que o Spring conect-se automaticamente com os beans (Depedencias, neste caso, com o repositorio do bd)
    private AlunoRepository alunoRepository;

    @Bean //adiciona pq parou de ser persistido, entao adicionamos para que ele entenda que deve executar esete metodo devemos colocar a anotação, acima do nome do metodo
    public String instanciarDB() throws ParseException{
        SimpleDateFormat formato = new SimpleDateFormat ("dd/MM/yyyy");
        Aluno aluno1 = new Aluno("Ellen Gabrielly", formato.parse("01/08/2022"), true);
        Aluno aluno2 = new Aluno("Coli", formato.parse("01/08/2022"), false);
        Aluno aluno3 = new Aluno("Luiza", formato.parse("01/08/2022"), true);
        Aluno aluno4 = new Aluno("Icaro", formato.parse("01/08/2022"), false);
        Aluno aluno5 = new Aluno("Kauã", formato.parse("25/08/2025"), true);
        alunoRepository.saveAll(Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5));
        return "";
    }
}
