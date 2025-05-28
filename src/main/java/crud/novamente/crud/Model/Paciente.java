package crud.novamente.crud.Model;

import org.springframework.beans.factory.annotation.Autowired;

import crud.novamente.crud.Pacientes.DadosAtualizadosPacientes;
import crud.novamente.crud.Pacientes.DadosPacientes;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@Table(name = "pacientes")
public class Paciente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    
    private String email;
    
    private String cpf;
    
    private String telefone;
 
    @Autowired
    private Endereco endereco;
    private boolean ativos;

    public Paciente(DadosPacientes dados){
        this.nome =dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.cpf = dados.cpf();
        this.endereco = new Endereco(dados.endereco());
    }

    public void atualizarInformacoes(DadosAtualizadosPacientes dados) {
      if(dados.nome() != null){
          this.nome = dados.nome();
      }
        if(dados.telefone() != null){
            this.telefone = dados.telefone();
        }
        if(dados.endereco() != null){
            this.endereco.atualizarEndereco(dados.endereco());
        }
    }

    public void excluir() {
        this.ativos = false;
    }
}
