package com.company;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.sql.*;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    private static final String createSql = "CREATE TABLE funcionario ( Id INT PRIMARY KEY, nome VARCHAR2 NOT NULL, sobrenome VARCHAR2 , idade INT, matricula INT )";
    private static final String dropSql = "DROP TABLE IF EXISTS funcionario";

    private static final String insertSql = "INSERT INTO funcionario (Id, nome, sobrenome, idade, matricula )" +
            "VALUES (1, 'Lamark', 'Neris', 21, 2342)";
    private static final String insertSql2 = "INSERT INTO funcionario (Id, nome, sobrenome, idade, matricula )" +
            "VALUES (2, 'Mark', 'Reis', 22, 2334)";
    private static final String insertSql3 = "INSERT INTO funcionario (Id, nome, sobrenome, idade, matricula )" +
            "VALUES (2, 'Marcos', 'Zeny', 23, 1232)";
    private static final String insertSql4 = "INSERT INTO funcionario (Id, nome, sobrenome, idade, matricula )" +
            "VALUES (4, 'Joao', 'Xin', 27, 1238)";
    private static final String insertSql5 = "INSERT INTO funcionario (Id, nome, sobrenome, idade, matricula )" +
            "VALUES (3, 'Jose', 'zin', 20, 1240)";

    private static final String selectSql = "SELECT * FROM funcionario ";

    private static final String updateSql = "UPDATE funcionario SET nome='Markus' WHERE Id=2";

    private static final String deleteSql = "DELETE FROM funcionario WHERE Id= 4";

    public static void main(String[] args) {

        PropertyConfigurator.configure("log4j.properties.properties");

        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(dropSql);
            statement.execute(createSql);

            try {
                statement.execute(insertSql);
                statement.execute(insertSql2);
                statement.execute(insertSql3);
                statement.execute(insertSql4);
                statement.execute(insertSql5);

                statement.execute(selectSql);

            } catch (SQLException IdError){
                logger.error("Impossível inserir funcionários com os dados iguais" + IdError.getMessage());
            }
            showFuncionario(connection);
            statement.execute(updateSql);
            ResultSet resultado = statement.executeQuery("SELECT * FROM funcionario WHERE Id = 2 ");

            while(resultado.next()) {
                logger.debug("O Funcionario: " + resultado.getString(2) + " foi atualizado!");
            }

            statement.execute(deleteSql);
            logger.info("O funcionario Joao foi deletado");
            statement.execute("DELETE FROM funcionario WHERE matricula = 1240");
            logger.info("O funcionario Jose foi deletado");
            showFuncionario(connection);

        }catch(Exception one){
            one.printStackTrace();
        }

    }
    private static void showFuncionario(Connection connection) throws Exception {
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("SELECT * FROM funcionario");

        while(result.next()) {
            Logger func = logger;
            String funci = result.getString(1);
            func.info("Id: " + funci + " nome: " + result.getString(2) + " sobrenome: " + result.getString(3) + " idade: " + result.getInt(4) + " matricula: " + result.getString(5));
        }
    }
    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa", "");
    }
}

