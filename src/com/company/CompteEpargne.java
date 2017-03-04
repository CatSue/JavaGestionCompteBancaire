package com.company;

/**
 * CompteEpargne : classe qui définit un compte épargne
 * Hérite de la classe Compte
 *
 * @author Marie PÉTROD
 * @version 1.0
 */

public class CompteEpargne extends Compte {

    //Taux
    private double taux;

    //************************CONSTRUCTEURS************************//
    public CompteEpargne(String pNom, String pPrenom, double pTaux) {
        super(pNom, pPrenom);
        taux = pTaux;
    }

    //************************GETTEURS************************//
    public double getTaux() {
        return taux;
    }

    //redéfinition de la méthode
    @Override
    public double getSold() {
        return super.getSold()*(1 + taux);
    }

    //************************SETTEURS************************//
    public void setTaux(double pTaux) {
        taux = pTaux;
    }

    //************************METHODES D'INSTANCE************************//
    @Override
    public void afficher(){
        //afficher le nomet solde du compte
        super.afficher();
        //afficher le taux
        System.out.println("Decouvert autorise : "+ getTaux());
        //afficher la liste des opérations
        super.afficherListeOpe();
    }
}
