package dev.java10x.CadastrandoNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    //Adicionar novas missões
    @PostMapping("/criar")
    public String criarMissao(){
        return "Criando uma nova missão...";
    }

    //Mostrar as Missões
    @GetMapping("/listar")
    public String listarMissao(){
        return "Mostrando todas as missões";
    }

    //Alterar missao
    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Alterando missão";
    }

    //Deletar Missão
    @PutMapping("/deletar")
    public String deletarMissao(){
        return "Deletando a missão";
    }
}
