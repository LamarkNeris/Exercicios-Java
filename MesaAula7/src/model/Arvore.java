package model;

public class Arvore {
    private Integer altura;
    private Integer largura;
    private String cor;

    public Arvore(Integer altura, Integer largura, String cor) {
        this.altura = altura;
        this.largura = largura;
        this.cor = cor;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public Integer getLargura() {
        return largura;
    }

    public void setLargura(Integer largura) {
        this.largura = largura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Arvore{" +
                "altura=" + altura +
                ", largura=" + largura +
                ", cor='" + cor + '\'' +
                '}';
    }
}
