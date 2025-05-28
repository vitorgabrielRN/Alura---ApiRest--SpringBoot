package crud.novamente.crud.Pacientes;

import crud.novamente.crud.Model.Paciente;

public record DadosListaPacientes(
             String nome,
             String email,
             String cpf,
             String telefone) {




    public DadosListaPacientes(Paciente paciente){
           this(paciente.getNome(),paciente.getEmail(),paciente.getCpf(),paciente.getTelefone());
    }            

}
