import model.Contato;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void  main(String [] args){

        List<Contato> contatos = new ArrayList<>();
        Contato contato1=  new Contato("Marcos","marcos@gmail.com","4515-2541");
        Contato contato2=  new Contato("Junior","Junior@gmail.com","4562-2541");
        Contato contato3=  new Contato("José","José@gmail.com","4587-2541");

        contatos.add(contato1);
        contatos.add(contato2);
        contatos.add(contato3);


        FileOutputStream fileOut;

        try {
            fileOut = new FileOutputStream("ListaContatos.txt");
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);

           objOut.writeObject(contatos);

        }catch (FileNotFoundException e) {
        e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Contato> contatos2 = null;
        FileInputStream fileInput;

        try{
            fileInput = new FileInputStream("ListaContatos.txt");
            ObjectInputStream objInput = new ObjectInputStream(fileInput);

            contatos2 = (ArrayList) objInput.readObject();

        }catch (Exception e){
            System.out.println("Erro no arquivo");
        }
        for (Contato contato: contatos2){
            System.out.println("Nome" + " " + contato.getNome() + " " + "idade" + " " + contato.getEmail() + " " + "Telefone" + " " + contato.getTelefone());
        }

    }

}
