package dev.java10x.CadastrandoNinjas.Ninjas;

import dev.java10x.CadastrandoNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cadastro_de_ninjas")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    //Varios ninjas só poderão ter apenas uma missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // CHAVE ESTRANGEIRA
    private MissoesModel missoes;

// --------------------- CONSTRUCTORS --------------------------
    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }


// --------------------- GETTERS e SETTERS --------------------------
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
