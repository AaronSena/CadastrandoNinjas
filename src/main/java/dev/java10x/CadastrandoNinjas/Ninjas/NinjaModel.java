package dev.java10x.CadastrandoNinjas.Ninjas;

import dev.java10x.CadastrandoNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Identificador")
    private Long id;

    @Column(name = "Nome")
    private String nome;

    @Column(unique = true, name = "Email")
    private String email;

    @Column(name = "Idade")
    private int idade;

    //Varios ninjas só poderão ter apenas uma missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // CHAVE ESTRANGEIRA
    private MissoesModel missoes;
}