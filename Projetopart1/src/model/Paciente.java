package model;

public class Paciente {
    private String nome;
    private String sobrenome;
    private String RG;
    private Integer dataCadastro;
    private Endereco endereco;

    public Paciente(String nome, String sobrenome, String RG, Integer dataCadastro, Endereco endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.RG = RG;
        this.dataCadastro = dataCadastro;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public Integer getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Integer dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
