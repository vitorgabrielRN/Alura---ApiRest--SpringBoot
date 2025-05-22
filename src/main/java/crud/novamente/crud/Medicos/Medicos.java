package crud.novamente.crud.Medicos;

import crud.novamente.crud.Model.Endereco;
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

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;


    public Medicos(DadosCadastrosMedicos dados){
        this.crm = dados.crm();
        this.email = dados.email();
        this.nome = dados.nome();
        this.especialidade = dados.especialidade();
        this.telefone = dados.telefone();
        this.endereco = new Endereco(dados.endereco());
    }
}
