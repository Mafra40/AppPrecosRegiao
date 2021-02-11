package app.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
public class Loja {

    @Id
    private String id;
    private String nome;
    private String tipo; //se é posto, mercado, depósito;
    private String dt_alteracao;
    private List<Produto> produto; // lista de produtos que cada loja tem


    public Loja(String id, String nome, String tipo, String dt_alteracao, List<Produto> produto) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.dt_alteracao = dt_alteracao;
        this.produto = produto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDt_alteracao() {
        return dt_alteracao;
    }

    public void setDt_alteracao(String dt_alteracao) {
        this.dt_alteracao = dt_alteracao;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }
}
