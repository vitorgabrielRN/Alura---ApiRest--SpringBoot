package crud.novamente.crud.Model;

import crud.novamente.crud.Medicos.DadosCadastrosMedicos;
import crud.novamente.crud.Medicos.Especialidade;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "medicos")
@Table(name ="Medico")
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

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    private Endereco Endereco;


    public Medicos(DadosCadastrosMedicos dados){
        this.crm = dados.crm();
        this.email = dados.email();
        this.nome = dados.nome();
        this.Endereco = new Endereco(dados.endereco());
        this.especialidade = dados.especialidade();
    }
}
