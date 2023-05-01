
package br.com.garagem.dto;

/**
 * Classe responsável por receber informações.
 */
public class ProdutoDTO {
    private String produto, data, tipo, responsavel, descricao;
    private int valor, id_produto;
    private byte[] produto_img;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public byte[] getProduto_img() {
        return produto_img;
    }

    public void setProduto_img(byte[] produto_img) {
        this.produto_img = produto_img;
    } 
}// Fecha a classe ProdutoDTO.
