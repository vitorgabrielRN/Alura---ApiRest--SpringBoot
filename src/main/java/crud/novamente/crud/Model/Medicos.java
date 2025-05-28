package crud.novamente.crud.Model;

import crud.novamente.crud.Medicos.DadosAtualizadosMedicos;
import crud.novamente.crud.Medicos.DadosCadastrosMedicos;
import crud.novamente.crud.Medicos.Especialidade;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "medicos")
@Table(name ="medicos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Medicos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String crm;
    private String email;
    private String telefone;
    private boolean ativo;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;


    public Medicos(DadosCadastrosMedicos dados){
        this.ativo = true;
        this.crm = dados.crm();
        this.email = dados.email();
        this.nome = dados.nome();
        this.especialidade = dados.especialidade();
        this.telefone = dados.telefone();
        this.endereco = new Endereco(dados.endereco());
    }


    public void atualizarInformacoes(DadosAtualizadosMedicos dados) {

        if(dados.nome() != null){
            this.nome = dados.nome();
        }
        if(dados.telefone() !=null)
            this.telefone = dados.telefone();
        if(dados.endereco() != null){
            this.endereco.atualizarEndereco(dados.endereco());
        }
    }

    public void excluir() {
        this.ativo = false;
    }
}

