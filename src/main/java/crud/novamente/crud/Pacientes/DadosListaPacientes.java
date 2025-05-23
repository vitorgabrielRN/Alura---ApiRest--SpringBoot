package crud.novamente.crud.Pacientes;

public record DadosListaPacientes(
             String nome,
             String email,
             String cpf,
             String telefone) {




    public DadosListaPacientes(Paciente paciente){
           this(paciente.getNome(),paciente.getEmail(),paciente.getCpf(),paciente.getTelefone());
    }            

}
