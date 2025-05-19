package crud.novamente.crud.Medicos;

public record DadosCadastrosMedicos(String nome,
                                    String email,
                                    String crm,
                                    Especialidade especialidade,
                                    DadosEndereco endereco
                                    ) {
}
