package server.Impl;

import server.IDonwload;
import user.Usuario;

public class ProxyDownload implements IDonwload {
    private ServiceDownload serviceDownload;

    public ProxyDownload(ServiceDownload serviceDownload){
        this.serviceDownload = serviceDownload;
    }

    @Override
    public void baixar(Usuario usuario) {

        if (usuario.getTipoUsuario() == "premium"){
            serviceDownload.baixar(usuario);
        } else{
            System.out.println("usuario não tem permissão para fazer download");
        }
    }
}
