package Configuracao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionH2 {
    public Connection getConnectionH2() throws Exception{
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");

    }
}


