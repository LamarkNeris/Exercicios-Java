import DAO.ServidorHD;
import model.Endereco;
import model.Paciente;

public class Main {

    public static void main(String[] args) {

        Endereco endereco1 = new Endereco("palmeiras", 51, "pirassununga", "mato grosso");
        Endereco endereco2 = new Endereco("corinthians", 21, "bangu", "sao paulo");

        Paciente paciente1 = new Paciente("Jose", "Silva", "521421465", 21, endereco1);
        Paciente paciente2 = new Paciente("Joao", "Souza", "215344142", 15, endereco2);
        ServidorHD servidor = new ServidorHD();

        servidor.insert(paciente1);
        servidor.insert(paciente2);
        servidor.select(paciente1.getNome());
        servidor.select(paciente2.getNome());
        servidor.delete(paciente1.getNome());
        servidor.selectAll();


        }
    }

