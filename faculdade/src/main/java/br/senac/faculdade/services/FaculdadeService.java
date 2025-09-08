package br.senac.faculdade.services;


import br.senac.faculdade.entities.Aluno;
import br.senac.faculdade.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class FaculdadeService {
    @Autowired
    AlunoRepository alunoRepository;

    public Aluno findById(Integer ra) {
        Optional<Aluno> aluno = alunoRepository.findById(ra);
        return aluno.orElse(null);
    }


    public List<Aluno> listarTodosAbertos() {
        List<Aluno> alunos = alunoRepository.listarTodosAbertos();
        return alunos;
    }

    public List<Aluno> listarTodosFechados() {
        List<Aluno> alunos = alunoRepository.listarTodosFechados();
        return alunos;
    }

    public List<Aluno> findAll(){
        List<Aluno> alunos = alunoRepository.findAll();
    return alunos;

    }

    public Aluno findByNome(String nome){
        Optional<Aluno> alunos = alunoRepository.findByNome(nome);
        return alunos.orElse(null);

    }
}
