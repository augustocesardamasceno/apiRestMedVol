package med.voll.api.endereco;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String complemento;
    private String numero;



    public Endereco(DadosEndereco dadosEndereco) {
        this.logradouro = dadosEndereco.logradouro();
        this.bairro = dadosEndereco.bairro();
        this.cep = dadosEndereco.cep();
        this.uf = dadosEndereco.uf();
        this.cidade = dadosEndereco.cidade();
        this.numero = dadosEndereco.numero();
        this.complemento = dadosEndereco.complemento();
    }

    public void atualizarInformacoes(DadosEndereco dados) {
        if (dados.logradouro() != null){
            this.logradouro = dados.logradouro();
        }
        if (dados.bairro() != null){
            this.bairro = dados.bairro();
        }
        if (dados.cep() != null){
            this.cep = dados.cep();
        }
        if (dados.uf() != null){
            this.uf = dados.uf();
        }
        if (dados.cidade() != null){
            this.cidade = dados.cidade();
        }
        if (dados.numero() != null){
            this.numero = dados.numero();
        }
        if (dados.complemento() != null){
            this.complemento = dados.complemento();
        }
    }
}
