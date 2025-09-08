package br.senac.faculdade.entities;

import jakarta.persistence.*; //importa o JPA como entity, id, column etc

import java.io.Serializable; //necessario para que o JPA consiga salvar/transmitir objetos
import java.time.LocalDateTime; //classe da PI de datas que representam data e hora sem fuso horario
import java.util.Date;


//definiçõa da entidade
@Entity(name = "Alunos") //diz ao JPA que a classe represnta uma tabela no BD
public class Aluno implements Serializable { //implements Serializable permite que o objeto seja convertido em bytes (Serialização)
    private static final long serialVersionUID = 1L; // garante que diferentes versoes da classe nao quebrem a serialização

    @Id //marca esse campo como chave primaria
    @GeneratedValue (strategy = GenerationType.IDENTITY) //valor do campo vai ser gerado automaticamente pelo banco (Auto-incremento)
    @Column (name = "RA") //criando coluna
    int ra;

    @Column (name = "Nome")
    String nome;

    @Column (name = "Data_Cadastro")
    Date dataCadastro; //guarda a data/hora de cadastro do aluno


    public Aluno() {}

    //construtores com todos os atributos
    public Aluno(int ra, String nome, Date dataCadastro) {
        this.ra = ra;
        this.nome = nome;
        this.dataCadastro = dataCadastro;
    }



    //construtor sem o RA(chave primaria) pq será gerado automaticamente
    public Aluno(String nome, Date dataCadastro,boolean ativo) {
        super();
        this.nome = nome;
        this.dataCadastro = dataCadastro;
        this.ativo = ativo;
    }


    @Column(name="Ativo")
    private boolean ativo;
    //gere os getters e setters
    public boolean isAtivo() {
        return ativo;
    }


    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    //getters e setters
    public Integer getRa() { //permitem acessar valores privados da classe
        return ra;
    }

    public void setRa(Integer ra) { //permitem modificar os valores
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }



    //toString serve para imprimir o objeto de forma legível
    @Override
    public String toString() {
        return "Alunos{" +
                "ra=" + ra +
                ", nome='" + nome + '\'' +
                ", dataCadastro=" + dataCadastro +
                '}';
    } //Saída → Alunos{ra=1, nome='Ellen', dataCadastro=2025-08-18T18:30}
}
