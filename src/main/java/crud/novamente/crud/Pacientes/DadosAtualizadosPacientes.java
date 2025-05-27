package crud.novamente.crud.Pacientes;

import crud.novamente.crud.Medicos.DadosEndereco;

public record DadosAtualizadosPacientes(
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
) {
}
