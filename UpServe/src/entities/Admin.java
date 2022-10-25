/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Admin
 */
public class Admin extends User {
    
    public Admin(int idUser, String fullName, String genreUser, String emailUser, String mdpUser, String region, String municipalite, String tel, String role, String jourTravail, String heureTravail, String profession) {
        super(idUser, fullName, genreUser, emailUser, mdpUser, region, municipalite, tel, role, jourTravail, heureTravail, profession);
    }

}


