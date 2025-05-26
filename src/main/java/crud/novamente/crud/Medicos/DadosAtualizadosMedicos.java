package crud.novamente.crud.Medicos;

public record DadosAtualizadosMedicos(
    Long id,
    String nome,
    String email,
    String telefone,
    DadosEndereco endereco
) {

}
