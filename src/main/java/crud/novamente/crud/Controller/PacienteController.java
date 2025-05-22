package crud.novamente.crud.Controller;

import crud.novamente.crud.Pacientes.DadosPacientes;
import crud.novamente.crud.Pacientes.Paciente;
import crud.novamente.crud.Repository.PacienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @Autowired
    PacienteRepository repository; 
    
    @PostMapping
    public  void CadastroPacientes(@RequestBody DadosPacientes dados){
    repository.save(new Paciente(dados));     
    }
}
