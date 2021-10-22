import Server.Impl.SerieNaoHabilitadaExcpt;
import Server.Impl.SerieProxy;
import Server.Impl.SerieService;

public class Main {
    public static void main(String[] args){
        SerieService service = new SerieService();
        SerieProxy proxy = new SerieProxy(service);

        try {
            System.out.println(proxy.getSerie("Brooklyn 99"));
            System.out.println(proxy.getSerie("Dexter"));
            System.out.println(proxy.getSerie("Game Of Thrones"));
            System.out.println(proxy.getSerie("The Invencible"));
            System.out.println(proxy.getSerie("The Flash"));


        } catch (SerieNaoHabilitadaExcpt ex){
            System.out.println(ex.getMessage());
        }
    }
}
