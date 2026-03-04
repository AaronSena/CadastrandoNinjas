package dev.java10x.CadastrandoNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas-ninja")
    public String boasVindas(){
        return "Olá, Seja muito bem vindo a minha aplicação";
    }

    // Adicionar Ninja            (CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja Criado";
    }

    // Mostrar Todos os Ninjas    (READ)
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas(){
        return "Mostrando todos os Ninjas";
    }

    // Mostrar Ninja por ID       (READ)
    @GetMapping("/todosID")
    public String mostrarTodosOsNinjasPorId(){
        return "Mostrando todos os Ninjas por ID";
    }

    // Alterar Dados dos Ninjas   (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjaPorId(){
        return "Alterando ninja por ID";
    }

    // Deletar Ninja              (DELETE)
    @DeleteMapping("/DeletarId")
    public String deletarNinjaPorId(){
        return "Deletando ninja por ID";
    }

}
