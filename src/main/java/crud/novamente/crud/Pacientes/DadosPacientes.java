package crud.novamente.crud.Pacientes;

import crud.novamente.crud.Medicos.DadosEndereco;

public record DadosPacientes(String Nome,
                             String Email,
                             String telefone,
                             String CPF,
                             DadosEndereco endereco) {
}
