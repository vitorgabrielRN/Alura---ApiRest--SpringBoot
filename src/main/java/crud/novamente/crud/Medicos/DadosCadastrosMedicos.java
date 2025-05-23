package crud.novamente.crud.Medicos;

import jakarta.validation.constraints.Pattern;

public record DadosCadastrosMedicos(

String nome,

String email,

@Pattern(regexp = "\\d{4,6}") 
String crm,

String telefone,
 
Especialidade especialidade,

DadosEndereco endereco ) {}        


