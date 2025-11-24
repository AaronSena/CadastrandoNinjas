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
    private Long id;
    private String nome;
    private String email;
    private int idade;

    //Varios ninjas só poderão ter apenas uma missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // CHAVE ESTRANGEIRA
    private MissoesModel missoes;
}