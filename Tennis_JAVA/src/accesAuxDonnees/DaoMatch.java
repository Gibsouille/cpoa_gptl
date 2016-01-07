package accesAuxDonnees;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.sql.DataSource;
import metier.Match;

public class DaoMatch extends DAO<Match>{
    
    public DaoMatch(DataSource ds) {
        super(ds);
    }
    
    @Override
    public void ajouter(Match element) throws SQLException, ClassNotFoundException, IOException {
        Connection co = Connexion.getConnexion("connexion.properties");
        PreparedStatement pstm = co.prepareStatement("INSERT INTO Matchs VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);");
        pstm.setInt(1, element.getNumMatch());
        //pstm.setInt(2, element.getNumCourt());
        pstm.setString(3, element.getTypeMatch());
        //pstm.setDate(4, (Date) element.getDate());
        pstm.setString(5, element.getModeJeu());
        pstm.setString(6, element.getTrancheHoraire());
        //pstm.setString(7, element.getPhaseFinale());
        //pstm.setInt(8, element.getIdEquipe1());
        //pstm.setInt(9, element.getIdEquipe2());
        
        pstm.executeUpdate();
        pstm.close();
        co.close();
    }

    @Override
    public void modifier(Match element) throws SQLException, ClassNotFoundException, IOException {
        Connection co = Connexion.getConnexion("connexion.properties");
        PreparedStatement pstm = co.prepareStatement("UPDATE Matchs SET numCourt = ?, typeMatch = ?, dateMatch = ?, modeJeu = ?, trancheHoraire = ?, phaseFinale = ?, idEquipe1 = ?, idEquipe2 = ?;");
        //pstm.setInt(1, element.getNumCourt());
        pstm.setString(2, element.getTypeMatch());
        //pstm.setDate(3, (Date) element.getDate());
        pstm.setString(4, element.getModeJeu());
        pstm.setString(5, element.getTrancheHoraire());
        //pstm.setString(6, element.getPhaseFinale());
        //pstm.setInt(7, element.getIdEquipe1());
        //pstm.setInt(8, element.getIdEquipe2());
        
        pstm.executeUpdate();
        pstm.close();
        co.close();
    }

    @Override
    public void charger(List<Match> liste) throws SQLException, ClassNotFoundException, IOException {
        Connection co = Connexion.getConnexion("connexion.properties");
        Statement stm = co.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM Matchs;");
        
        while (rs.next()) {
            int num = rs.getInt("numMatch"), numCourt = rs.getInt("numCourt"), idEquipe1 = rs.getInt("idEquipe1");
            if (rs.wasNull())
                idEquipe1 = -1;
            
            int idEquipe2 = rs.getInt("idEquipe2");
            if (rs.wasNull())
                idEquipe2 = -1;
            
            String type = rs.getString("typeMatch"), modeJeu = rs.getString("modeJeu"), trancheHoraire = rs.getString("trancheHoraire"),
                   phaseFinale = rs.getString("phaseFinale");
            
            Date date = rs.getDate("date");
            
            //liste.add(new Match(num, numCourt, type, date, modeJeu, trancheHoraire, phaseFinale, idEquipe1, idEquipe2));
        }
        
        rs.close();
        stm.close();
        co.close();
    }

    @Override
    public void supprimer(Match element) throws SQLException, ClassNotFoundException, IOException {
        Connection co = Connexion.getConnexion("connexion.properties");
        PreparedStatement pstm = co.prepareStatement("DELETE FROM Matchs WHERE numMatch = ?;");
        
        pstm.setInt(1, element.getNumMatch());
        pstm.executeUpdate();
        pstm.close();
        co.close();
    }

}
