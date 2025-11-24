package dev.java10x.CadastrandoNinjas.Missoes;

import dev.java10x.CadastrandoNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeMissao;
    private String dificuldade;

    // Uma missão poderá ter varios ninjas atribuidos
    @OneToMany(mappedBy = "missoes")
    private List <NinjaModel> ninjas ;

}
