import server.IDonwload;
import server.Impl.ProxyDownload;
import server.Impl.ServiceDownload;
import user.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("premium");
        Usuario usuario2 = new Usuario("free");


        IDonwload proxy = new ProxyDownload(new ServiceDownload());

        proxy.baixar(usuario1);
        proxy.baixar(usuario2);

    }
}
