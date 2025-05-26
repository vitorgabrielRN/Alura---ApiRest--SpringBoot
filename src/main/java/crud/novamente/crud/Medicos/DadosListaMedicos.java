package crud.novamente.crud.Medicos;

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
