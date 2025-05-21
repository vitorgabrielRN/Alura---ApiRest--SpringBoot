package crud.novamente.crud.Model;

import crud.novamente.crud.Medicos.DadosEndereco;
import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Endereco {
    private  String logradouro;
    private  String bairro;
    private  String cep;
    private  String cidade;
    private  String uf;
    private  String complemento;
    private  String numero;

    public Endereco(DadosEndereco dados) {
        this.logradouro = dados.logradouro();
        this.cep = dados.cep();
        this.uf   = dados.uf();
        this.cidade = dados.cidade();
        this.bairro = dados.bairro();
        this.complemento = dados.complemento();
        this.numero = dados.numero();
    }
}
