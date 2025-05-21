package crud.novamente.crud.Medicos;

import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
        
        String logradouro,
        
        String bairro,
        
        @Pattern(regexp= "\\d{8}")
        String cep,
        
        String cidade,
        
        String uf,

        String complemento,

        String numero) {
}
