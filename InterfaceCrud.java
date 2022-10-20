/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.User;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface InterfaceCrud {
    public void ajouterUser (User u) ;
    public void modifierUser(User u) ;
    public void supprimerUser(int id) ;
    public List<User> AfficherUser() ;
}
