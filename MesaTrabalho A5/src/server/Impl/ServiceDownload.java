package server.Impl;

import server.IDonwload;
import user.Usuario;

public class ServiceDownload implements IDonwload {
    @Override
    public void baixar(Usuario usuario) {

        System.out.println("usuario está fazendo download");
    }
}
