
package br.com.garagem.dto;


public class FuncionarioDTO {
    private String nome, dataNascimento;
    private int id_funcionario, idade;
    private byte[] funcionario_img;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public byte[] getFuncionario_img() {
        return funcionario_img;
    }

    public void setFuncionario_img(byte[] funcionario_img) {
        this.funcionario_img = funcionario_img;
    }
}// Fecha classe FuncionarioDTO.
