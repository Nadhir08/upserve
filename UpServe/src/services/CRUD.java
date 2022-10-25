/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import utils.MyDB;

/**
 *
 * @author Admin
 */
public class CRUD implements  InterfaceCrud{
    Connection conx=MyDB.getInstance().getConnection();
        @Override
    public void ajouterUser(User u) {
        String req = "INSERT INTO `user`( `fullName`, `genreUser`, `emailUser`, `mdpUser`, `region`, `municipalite`, `tel`, `role`, `jourTravail`, `heureTravail`, `profession`) VALUES ('" +u.getFullName()+ "','" +u.getGenreUser()+ "','" +u.getEmailUser()+ "','" +u.getMdpUser()+ "','" +u.getRegion()+ "','" +u.getMunicipalite()+ "','" +u.getTel()+ "','" +u.getRole()+ "','" +u.getJourTravail()+ "','" +u.getHeureTravail()+ "','" +u.getProfession()+ "')" ;
        Statement st  ;
        try {
        st = conx.createStatement() ;
        st.executeUpdate(req) ;}
        catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override

        public void modifierUser(User u) {
         String req = "UPDATE `user` SET `fullName`='"+u.getFullName()+"',`genreUser`='"+u.getGenreUser()+"',`emailUser`='"+u.getEmailUser()+"',`mdpUser`='"+u.getMdpUser()+"',`region`='"+u.getRegion()+"',`municipalite`='"+u.getMunicipalite()+"',`tel`='"+u.getTel()+"',`role`='"+u.getRole()+"',`jourTravail`='"+u.getJourTravail()+"',`heureTravail`='"+u.getHeureTravail()+"',`profession`='"+u.getProfession()+"' WHERE idUser ="+ u.getIdUser();
        Statement st  ;
        try {
        st = conx.createStatement() ;
        st.executeUpdate(req) ;
        System.out.println("l'utilisateur est modifié");}
        catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }}

    @Override
     public void supprimerUser(int idUser) {
         try {
        String req=" DELETE FROM user WHERE idUser="+ idUser ;

        PreparedStatement St = conx.prepareStatement(req);
        St.executeUpdate();
    } catch (SQLException ex) {
        System.err.println(ex.getMessage());
    }
       
    }


    @Override
        public List<User> AfficherUser() {
              List <User> list = new ArrayList<>();
        try {
    String req = "SELECT * FROM  user";        
    Statement st;
    st =conx.createStatement();
    ResultSet rs = st.executeQuery(req);
    while(rs.next()){
    User u = new User (rs.getInt(1), rs.getString("fullName"),rs.getString("genreUser"),rs.getString("emailUser"),rs.getString("mdpUser"),rs.getString("region"),rs.getString("municipalite"),rs.getString("tel"),rs.getString("role"),rs.getString("jourTravail"),rs.getString("heureTravail"),rs.getString("profession"));
    list.add(u);
              }
        }
        catch (SQLException ex){
    System.err.println(ex.getMessage());
}
    return list;
    }
}

 