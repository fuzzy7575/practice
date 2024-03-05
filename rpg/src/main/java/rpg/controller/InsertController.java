package rpg.controller;

import rpg.model.dto.UserDTO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import static rpg.common.JDBCTemplate.close;
import static rpg.common.JDBCTemplate.getConnection;

public class InsertController {

    Properties prop = new Properties();

    public InsertController() {
        try {
            prop.loadFromXML(new FileInputStream("src/main/java/rpg/mapper/rpg-query.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int insertUser(UserDTO newUser) {

        Connection con = getConnection();
        PreparedStatement pstmt = null;
        int result = 0;

        try {
            String query = prop.getProperty("insertUser");
            System.out.println(query);

            pstmt = con.prepareStatement(query);
            pstmt.setString(1, newUser.getUserName());
            pstmt.setInt(2, newUser.getUserCharm());
            pstmt.setObject(3, newUser.getUserBag());
            pstmt.setInt(4, newUser.getUserMoney());

            result = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }   finally {
            close(pstmt);
            close(con);
        }

        return result;

    }


    public void insertUserItem(int itemCode) {

        int bagCode = 1;

        Connection con = getConnection();
        PreparedStatement pstmt = null;
        int result = 0;

        try {
            String query = prop.getProperty("insertUserItem");
            System.out.println(query);

            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, bagCode);
            pstmt.setInt(2, itemCode);
            pstmt.setInt(3, bagCode);
            pstmt.setInt(4, itemCode);

            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }   finally {
            close(pstmt);
            close(con);
        }

//        return result;

    }
}