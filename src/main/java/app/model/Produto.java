package app.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Produto {

    @Id
    private String id;
    private String nome;
    private String valor_unitario;
    private String dt_ult_alteracao;
    private String imagem;
    private List<ProdutoHistorico> historico_valor; // guarda o histórico do ultimo valor

    public Produto(String id, String nome, String valor_unitario, String dt_ult_alteracao, String imagem, List<ProdutoHistorico> historico_valor) {
        this.id = id;
        this.nome = nome;
        this.valor_unitario = valor_unitario;
        this.dt_ult_alteracao = dt_ult_alteracao;
        this.imagem = imagem;
        this.historico_valor = historico_valor;
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

    public String getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(String valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    public String getDt_ult_alteracao() {
        return dt_ult_alteracao;
    }

    public void setDt_ult_alteracao(String dt_ult_alteracao) {
        this.dt_ult_alteracao = dt_ult_alteracao;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public List<ProdutoHistorico> getHistorico_valor() {
        return historico_valor;
    }

    public void setHistorico_valor(List<ProdutoHistorico> historico_valor) {
        this.historico_valor = historico_valor;
    }
}
