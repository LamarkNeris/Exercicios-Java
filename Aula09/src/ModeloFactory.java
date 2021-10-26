import model.Modelo;

import java.util.HashMap;
import java.util.Map;

public class ModeloFactory {
    private static Map<String, Modelo> flyweight = new HashMap<>();
    private static Integer contador = 0;

    public Integer getContador() {
        return contador;
    }

    public Modelo verificarRoupa(String tamanho, String tipo, Boolean eNovo, Boolean importado){
        String id = "Tipo: " + tipo ;

        if (!flyweight.containsKey(id)){
            flyweight.put(id, new Modelo(tamanho, tipo, eNovo, importado));
            System.out.println("Novo modelo criado!");
            contador++;
        }
        else {
            System.out.println("Modelo já existe!");
        }
        return flyweight.get(id);
    }

}
