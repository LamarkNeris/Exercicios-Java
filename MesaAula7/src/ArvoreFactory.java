import model.Arvore;

import java.util.HashMap;
import java.util.Map;

public class ArvoreFactory {
    private static Map<String, Arvore> flyweight = new HashMap<>();

    public Arvore pegarArvore(Integer altura, Integer largura, String cor ){
        String tipo = "Altura:" + altura + "Largura:" + largura + "Cor:" + cor;

        if (!flyweight.containsKey(tipo)){
            flyweight.put(tipo, new Arvore(altura, largura, cor));
            System.out.println("Nova Arvore! ");
        }
        else{
            System.out.println("Arvore já existe!");
        }
        return flyweight.get(tipo);
    }
}
