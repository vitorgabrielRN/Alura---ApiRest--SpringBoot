package crud.novamente.crud.Controller;

import crud.novamente.crud.Model.Paciente;
import crud.novamente.crud.Pacientes.DadosAtualizadosPacientes;
import crud.novamente.crud.Pacientes.DadosListaPacientes;
import crud.novamente.crud.Pacientes.DadosPacientes;
import crud.novamente.crud.Repository.PacienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @Autowired
    PacienteRepository repository; 
    
    @PostMapping
    public  void CadastroPacientes(@RequestBody DadosPacientes dados){
    repository.save(new Paciente(dados));     
    }

    @GetMapping
    public Page<DadosListaPacientes> listaPacientes(Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListaPacientes::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody DadosAtualizadosPacientes dados){
        var paciente = repository.getReferenceById(dados.id());
        paciente.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        var pacientes = repository.getReferenceById(id);
        pacientes.excluir();
    }
    
}
