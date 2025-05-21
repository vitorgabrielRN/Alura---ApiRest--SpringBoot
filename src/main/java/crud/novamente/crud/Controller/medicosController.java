package crud.novamente.crud.Controller;

import crud.novamente.crud.Medicos.DadosCadastrosMedicos;
import crud.novamente.crud.Medicos.Medicos;
import crud.novamente.crud.Repository.MedicosRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medicos")
public class medicosController {
    @Autowired
    private MedicosRepository medicosRepository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastrosMedicos dados){
    medicosRepository.save(new Medicos(dados));


    }

}
