package accesAuxDonnees;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

public class Connexion {
    public static Connection getConnexion(String nomFichierProp) throws SQLException, ClassNotFoundException, IOException {
        Properties props = new Properties();
        URL urlFichierProp = Connexion.class.getResource(nomFichierProp);
        BufferedInputStream bis = null;
        try {
          bis = new BufferedInputStream(urlFichierProp.openStream());
          props.load(bis);
          String driver = props.getProperty("driver");
          String url = props.getProperty("url");
          String userid = props.getProperty("userid");
          String pwd = props.getProperty("pwd");
          Class.forName(driver);
          return DriverManager.getConnection(url, userid, pwd);
        }
        finally {
          if (bis != null) {
            bis.close();
          }
        }
    }
}
