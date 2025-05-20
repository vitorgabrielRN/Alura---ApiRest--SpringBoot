package crud.novamente.crud.Controller;

import crud.novamente.crud.Medicos.DadosCadastrosMedicos;
import crud.novamente.crud.Model.Medico;
import crud.novamente.crud.Repository.MedicosRepository;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medicos")
public class medicosController {
    @Autowired
    private MedicosRepository medicosRepository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastrosMedicos dados){
       medicosRepository.save(new Medico(dados));


    }

}
