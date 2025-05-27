package crud.novamente.crud.Model;

import crud.novamente.crud.Medicos.DadosEndereco;
import jakarta.persistence.Embeddable;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
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

    public void atualizarEndereco(DadosEndereco dados) {
        if(dados.logradouro() !=null){
            this.logradouro = dados.logradouro();
        }
        if(dados.bairro() !=null){
            this.bairro = dados.bairro();
        }
        if(dados.cep() !=null){
            this.cep = dados.cep();
        }
        if(dados.cidade() !=null){
            this.cidade = dados.cidade();
        }
        if(dados.uf() !=null){
            this.uf = dados.uf();
        }
        if(dados.complemento() !=null){
            this.complemento = dados.complemento();
        }
        if(dados.numero() !=null){
            this.numero = dados.numero();

        }
    }
}
