package crud.novamente.crud.Pacientes;

import crud.novamente.crud.Medicos.DadosEndereco;

public record DadosPacientes(String nome,
                             String email,
                             String telefone,
                             String cpf,
                             DadosEndereco endereco) {
}
