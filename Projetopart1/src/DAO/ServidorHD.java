package DAO;

import Configuracao.ConnectionH2;
import model.Paciente;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ServidorHD implements IDao<Paciente> {

    private final ConnectionH2 configuracao = new ConnectionH2();

    @Override
    public Paciente insert(Paciente paciente) {
        String query = String.format("INSERT INTO Paciente VALUES ('%s','%s','%s','%s','%s',)",
        paciente.getNome(),
        paciente.getSobrenome(),
        paciente.getRG(),
        paciente.getDataCadastro(),
        paciente.getEndereco());

        try{
            Connection connection = configuracao.getConnectionH2();
            Statement state = connection.createStatement();
            state.execute(query);
            state.close();

        }catch(Exception e){
            e.printStackTrace();
        }
         return paciente;
    }

    @Override
    public void delete(String nome) {
        String query = String.format("DELETE FROM Paciente WHERE id = %s", nome);

        try{
            Connection connection = configuracao.getConnectionH2();
            Statement state = connection.createStatement();
            state.execute(query);
            state.close();
        }catch(Exception e){
            e.printStackTrace();
        }



    }

    @Override
    public void select(String nome) {
        String query = String.format("SELECT * FROM Paciente WHERE id = %s", nome);

        try{
            Connection connection = configuracao.getConnectionH2();
            Statement stmt = connection.createStatement();
            ResultSet result = stmt.executeQuery(query);

            while(result.next()){
                System.out.println("----------------");
                System.out.println(result.getInt(1));
                System.out.println(result.getString(2));
                System.out.println(result.getString(3));
                System.out.println(result.getString(4));
                System.out.println(result.getInt(5));
                System.out.println(result.getDouble(6));
                System.out.println("----------------");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @Override
    public void selectAll() {
        String query = String.format("SELECT * FROM Paciente ");

        try{
            Connection connection = configuracao.getConnectionH2();
            Statement stmt = connection.createStatement();
            ResultSet result = stmt.executeQuery(query);

            while(result.next()){
                System.out.println("----------------");
                System.out.println(result.getInt(1));
                System.out.println(result.getString(2));
                System.out.println(result.getString(3));
                System.out.println(result.getString(4));
                System.out.println(result.getInt(5));
                System.out.println(result.getDouble(6));
                System.out.println("----------------");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
