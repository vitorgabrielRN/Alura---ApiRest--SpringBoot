package crud.novamente.crud.Medicos;

import crud.novamente.crud.Model.Medicos;

public record DadosListaMedicos(
    Long id,
    String nome,
    String email,
    String crm,
    Especialidade especialidade) {


        public DadosListaMedicos(Medicos medicos){
            this(medicos.getId(),medicos.getNome(),medicos.getEmail(),medicos.getCrm(), medicos.getEspecialidade());
        }
}
