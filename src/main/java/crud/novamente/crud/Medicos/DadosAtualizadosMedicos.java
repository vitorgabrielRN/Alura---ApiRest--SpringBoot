package crud.novamente.crud.Medicos;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizadosMedicos(

        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
) {

}
