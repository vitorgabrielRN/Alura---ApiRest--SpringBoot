package crud.novamente.crud.Controller;

import crud.novamente.crud.Medicos.DadosAtualizadosMedicos;
import crud.novamente.crud.Medicos.DadosCadastrosMedicos;
import crud.novamente.crud.Medicos.DadosListaMedicos;
import crud.novamente.crud.Medicos.Medicos;
import crud.novamente.crud.Repository.MedicosRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
   
    @GetMapping   
   public Page<DadosListaMedicos> listar(@PageableDefault(size = 10)Pageable paginacao){
    return medicosRepository.findAll(paginacao).map(DadosListaMedicos::new);
   }
   
   @PutMapping
   @Transactional
   public void atualizar(@RequestBody DadosAtualizadosMedicos dados){
    var medico = medicosRepository.getReferenceById(dados.id());
    medico.atualizarInformacoes(dados);
   }
}
