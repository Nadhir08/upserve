/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.User;
import services.CRUD;
import utils.MyDB;

/**
 *
 * @author Admin
 */
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyDB c =MyDB.getInstance();
        User U1=new User(22,"nadhir","homme","esb@g","az19","nab","bk","518197","technicien","jeudi","10h","plombier");
        CRUD cc=new CRUD();
        
        
       // cc.ajouterUser(U1);
        //cc.modifierUser(U1);
     //  cc.supprimerUser(22);
        cc.AfficherUser().forEach(System.out::println);
    }
    
}
