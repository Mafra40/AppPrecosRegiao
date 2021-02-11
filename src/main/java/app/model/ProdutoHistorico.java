package app.model;

import org.springframework.data.annotation.Id;

public class ProdutoHistorico {

    @Id
    private String id_produto;
    private String ult_valor;
    private String dt_ult_valor;
    private String dt_ult_alteracao;

    public ProdutoHistorico(String id_produto, String ult_valor, String dt_ult_valor, String dt_ult_alteracao) {
        this.id_produto = id_produto;
        this.ult_valor = ult_valor;
        this.dt_ult_valor = dt_ult_valor;
        this.dt_ult_alteracao = dt_ult_alteracao;
    }

    public String getId_produto() {
        return id_produto;
    }

    public void setId_produto(String id_produto) {
        this.id_produto = id_produto;
    }

    public String getUlt_valor() {
        return ult_valor;
    }

    public void setUlt_valor(String ult_valor) {
        this.ult_valor = ult_valor;
    }

    public String getDt_ult_valor() {
        return dt_ult_valor;
    }

    public void setDt_ult_valor(String dt_ult_valor) {
        this.dt_ult_valor = dt_ult_valor;
    }

    public String getDt_ult_alteracao() {
        return dt_ult_alteracao;
    }

    public void setDt_ult_alteracao(String dt_ult_alteracao) {
        this.dt_ult_alteracao = dt_ult_alteracao;
    }
}
