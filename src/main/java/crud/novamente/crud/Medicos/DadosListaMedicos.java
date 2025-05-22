package crud.novamente.crud.Medicos;

public record DadosListaMedicos(
    String nome,
    String email,
    String crm,
    Especialidade especialidade) {


        public DadosListaMedicos(Medicos medicos){
            this(medicos.getNome(),medicos.getEmail(),medicos.getCrm(), medicos.getEspecialidade());
        }
}
