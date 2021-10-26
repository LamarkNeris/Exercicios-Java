import model.Modelo;

public class Main {
    public static void main(String [] args){
        ModeloFactory factory = new ModeloFactory();
        Modelo modelo1 = factory.verificarRoupa("XS", "camisa", true, false);
        Modelo modelo2 = factory.verificarRoupa("S", "calça", false, true);
        Modelo modelo3 = factory.verificarRoupa("M", "bermuda", true, true);
        Modelo modelo4 = factory.verificarRoupa("XS", "camisa", true, false);

        System.out.println(modelo1.toString());
        System.out.println(modelo2.toString());
        System.out.println(modelo3.toString());
        System.out.println(modelo4.toString());


    }
}
