package rpg.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import rpg.model.dto.CharmDTO;

import static rpg.common.JDBCTemplate.close;
import static rpg.common.JDBCTemplate.getConnection;

public class UpdateController {

    Connection con = getConnection();
    Properties prop = new Properties();
    public UpdateController() {
        try {
            prop.loadFromXML(new FileInputStream("src/main/java/rpg/mapper/rpg-query.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int updateCharm(CharmDTO changeCharm) {

        PreparedStatement pstmt = null;
        int result = 0;

        try {
            String query = prop.getProperty("updateCharm");
            System.out.println(query);

            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, changeCharm.getCharm());
            pstmt.setInt(2, changeCharm.getUserCode());
            pstmt.setInt(3, changeCharm.getNpcCode());

            result = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }   finally {
            close(pstmt);
            close(con);
        }

        return result;

    }
}