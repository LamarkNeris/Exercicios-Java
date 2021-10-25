import model.Arvore;

public class Main {
    public static void main(String [] args){
        ArvoreFactory factory = new ArvoreFactory();
        Arvore arvore1 = factory.pegarArvore(200, 300, "vermelho");
        Arvore arvore2 = factory.pegarArvore(100, 400, "verde");
        Arvore arvore3 = factory.pegarArvore(200, 300, "vermelho");

        System.out.println(arvore1.toString());
        System.out.println(arvore2.toString());
        System.out.println(arvore3.toString());
    }
}
