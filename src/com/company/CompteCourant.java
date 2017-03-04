package com.company;

/**
 * CompteCourant : classe qui définit un compte courant
 * Hérite de la classe Compte
 *
 * @author Marie PÉTROD
 * @version 1.0
 */

public class CompteCourant extends Compte {

    //Découvert autorisé (variable d'instance)
    private double decouvertAuto;

    //************************CONSTRUCTEURS************************//

    public CompteCourant(String pNom, String pPrenom, double pDecouvertAuto) {
        super(pNom, pPrenom);
        decouvertAuto = pDecouvertAuto;
    }

    //************************GETTEURS************************//
    /**
     * Objectif : renvoyer le découvert autorisé du compte
     *
     * @return : valeur du découvert autorisé
     */
    public double getDecouvertAuto() {
        return decouvertAuto;
    }

    //************************SETTEURS************************//
    /**
     * Objectif : modifier le découvert autorisé du compte
     *
     * @param pDecouvertAuto : nouveau découvert autorisé du compte
     */
    public void setDecouvertAuto(double pDecouvertAuto) {
        decouvertAuto = pDecouvertAuto;
    }

    //************************METHODES D'INSTANCE************************//
    @Override
    public void afficher(){
        //afficher le nomet solde du compte
        super.afficher();
        //afficher le découvert
        System.out.println("Decouvert autorise : "+ getDecouvertAuto());
        //afficher la liste des opérations
        super.afficherListeOpe();
    }

}
