package dev.java10x.CadastrandoNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    // INJEÇÃO DE DEPENDENCIA DA CLASSE SERVICE
    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }


    // ROTAS
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
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    // Mostrar Ninja por ID       (READ)
    @GetMapping("/listarID")
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
