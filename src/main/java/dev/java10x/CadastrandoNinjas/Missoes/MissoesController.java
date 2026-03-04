package dev.java10x.CadastrandoNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    //Mostrar as Missões
    @GetMapping("/listar")
    public String listarMissao(){
        return "Mostrando todas as missões";
    }

    //Adicionar novas missões
    @PostMapping("/criar")
    public String criarMissao(){
        return "Criando uma nova missão...";
    }

    //Alterar missao
    @PutMapping("/alterar")
    public String alterarMissaoPorID(){
        return "Alterando missão do ID escolhido";
    }

    //Deletar Missão
    @PutMapping("/deletar")
    public String deletarMissaoPorID(){
        return "Deletando a missão do ID escolhido";
    }
}
