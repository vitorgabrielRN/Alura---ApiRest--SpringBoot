package crud.novamente.crud.Controller;

import crud.novamente.crud.Medicos.DadosCadastrosMedicos;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medicos")
public class medicosController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastrosMedicos dados){
        System.out.println(dados);
    }

}
