package Server.Impl;

import Server.ISerie;

import java.util.Locale;

public class SerieProxy implements ISerie {
    Integer qtdViews;
    SerieService serieService;

    public SerieProxy(SerieService serieService) {
        this.serieService = serieService;
        this.qtdViews = 0;
    }


    @Override
    public String getSerie(String nome) {
        if ((this.qtdViews <= 5 )){
            nome = nome.replaceAll(" ", "").toLowerCase();
            this.qtdViews++;
            return serieService.getSerie(nome);
        }
        else{
            throw new SerieNaoHabilitadaExcpt("Quantidade máxima alcançada");
        }
    }
}
