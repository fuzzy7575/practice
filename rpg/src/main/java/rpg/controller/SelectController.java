package rpg.controller;

import rpg.model.dto.UserDTO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import static rpg.common.JDBCTemplate.close;
import static rpg.common.JDBCTemplate.getConnection;

public class SelectController {

    Properties prop = new Properties();

    public SelectController() {
        try {
            prop.loadFromXML(new FileInputStream("src/main/java/rpg/mapper/rpg-query.xml"));
        } catch (InvalidPropertiesFormatException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void selectUserInfo(UserDTO newUser) {

    Connection con = getConnection();

    PreparedStatement pstmt = null;
    ResultSet rset = null;

    UserDTO row = null;
    List<UserDTO> userList = null;

    int code = 1;

        try {
            String query = prop.getProperty("selectUserInfo");
            System.out.println(query);

            pstmt = con.prepareStatement(query);
            pstmt.setInt(1,code);

            System.out.println("query = " + query);

            rset = pstmt.executeQuery();

            // 조회된 여러 행을 담아놓을 ArrayList 객체 생성
            userList = new ArrayList<>();

            while(rset.next()) {
                row = new UserDTO();

                row.setUserName(rset.getString("USER_NAME"));
                row.setUserCharm(rset.getInt("USER_CHARM"));
                row.setUserBag(rset.getInt("USER_BAG"));
                row.setEquippedItem(rset.getInt("USER_EQUIPPED"));
                row.setUserMoney(rset.getInt("USER_MONEY"));

                userList.add(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        close(rset);
        close(pstmt);
        close(con);
        }
        for(UserDTO user : userList) {
        System.out.println(user);
        }

    }

}
