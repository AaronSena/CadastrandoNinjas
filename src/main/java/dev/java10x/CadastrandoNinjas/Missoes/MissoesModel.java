package dev.java10x.CadastrandoNinjas.Missoes;

import dev.java10x.CadastrandoNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "tb_missoes")
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeMissao;
    private String dificuldade;

    // Uma missão poderá ter varios ninjas atribuidos
    @OneToMany(mappedBy = "missoes )
    private List <NinjaModel> ninjas ;

// --------------------- CONSTRUCTORS --------------------------

    public MissoesModel() {
    }

    public MissoesModel(Long id, String nomeMissao, String dificuldade) {
        this.id = id;
        this.nomeMissao = nomeMissao;
        this.dificuldade = dificuldade;
    }

// --------------------- GETTERS e SETTERS --------------------------


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeMissao() {
        return nomeMissao;
    }

    public void setNomeMissao(String nomeMissao) {
        this.nomeMissao = nomeMissao;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

}
