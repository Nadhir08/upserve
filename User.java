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
public class User {
       private int idUser;
    private String fullName;
    private int genreUser;
    private String emailUser;
    private String mdpUser;
    private String region;
    private String municipalite;
    private String tel;
    private String role;
    private String jourTravail;
    private String heureTravail;
    private String profession;

    public User(int idUser, String fullName, int genreUser, String emailUser, String mdpUser, String region, String municipalite, String tel, String role, String jourTravail, String heureTravail, String profession) {
        this.idUser = idUser;
        this.fullName = fullName;
        this.genreUser = genreUser;
        this.emailUser = emailUser;
        this.mdpUser = mdpUser;
        this.region = region;
        this.municipalite = municipalite;
        this.tel = tel;
        this.role = role;
        this.jourTravail = jourTravail;
        this.heureTravail = heureTravail;
        this.profession = profession;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getGenreUser() {
        return genreUser;
    }

    public void setGenreUser(int genreUser) {
        this.genreUser = genreUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getMdpUser() {
        return mdpUser;
    }

    public void setMdpUser(String mdpUser) {
        this.mdpUser = mdpUser;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getMunicipalite() {
        return municipalite;
    }

    public void setMunicipalite(String municipalite) {
        this.municipalite = municipalite;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getJourTravail() {
        return jourTravail;
    }

    public void setJourTravail(String jourTravail) {
        this.jourTravail = jourTravail;
    }

    public String getHeureTravail() {
        return heureTravail;
    }

    public void setHeureTravail(String heureTravail) {
        this.heureTravail = heureTravail;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "User{" + "idUser=" + idUser + ", fullName=" + fullName + ", genreUser=" + genreUser + ", emailUser=" + emailUser + ", mdpUser=" + mdpUser + ", region=" + region + ", municipalite=" + municipalite + ", tel=" + tel + ", role=" + role + ", jourTravail=" + jourTravail + ", heureTravail=" + heureTravail + ", profession=" + profession + '}';
    }
    
    
}
