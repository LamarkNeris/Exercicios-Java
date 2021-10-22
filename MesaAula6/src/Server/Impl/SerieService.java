package Server.Impl;

import Server.ISerie;

public class SerieService implements ISerie {

    @Override
    public String getSerie(String nome) {
        return "www." + nome + ".com.br";
    }
}
