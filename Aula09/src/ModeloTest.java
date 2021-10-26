import model.Modelo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ModeloTest {
    @Test
    public void VerifRoupa(){
        ModeloFactory factory = new ModeloFactory();
        Modelo modelo = factory.verificarRoupa("XS", "camisa", true, false);

        Assertions.assertEquals(modelo,factory.verificarRoupa("X", "camisa", true, false));

    }
    @Test
    public void VerifTamanho(){
        ModeloFactory factory = new ModeloFactory();
        Modelo modelo1 = factory.verificarRoupa("XS", "camisa", true, false);
        Modelo modelo2 = factory.verificarRoupa("S", "calça", false, true);
        Modelo modelo3 = factory.verificarRoupa("M", "bermuda", true, true);
        Modelo modelo4 = factory.verificarRoupa("XS", "camisa", true, false);

        Assertions.assertEquals(3, factory.getContador());
    }
}
