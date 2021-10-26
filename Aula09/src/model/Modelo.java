package model;

public class Modelo {
    private String tamanho;
    private String tipo;
    private Boolean eNovo;
    private Boolean importado;

    public Modelo(String tamanho, String tipo, Boolean eNovo, Boolean importado) {
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.eNovo = eNovo;
        this.importado = importado;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean geteNovo() {
        return eNovo;
    }

    public void seteNovo(Boolean eNovo) {
        this.eNovo = eNovo;
    }

    public Boolean getImportado() {
        return importado;
    }

    public void setImportado(Boolean importado) {
        this.importado = importado;
    }

    @Override
    public String toString() {
        return "Modelos{" +
                "tamanho='" + tamanho + '\'' +
                ", tipo='" + tipo + '\'' +
                ", eNovo=" + eNovo +
                ", importado=" + importado +
                '}';
    }
}
