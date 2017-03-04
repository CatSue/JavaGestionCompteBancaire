package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * GestionDeComptes : classe qui permet de gérer les comptes
 *
 * @author Marie PÉTROD
 * @version 1.0
 */

public class GestionDeComptes {

    //liste de comptes
    private List<Compte> listeComptes = new ArrayList<Compte>();

    //************************METHODES D'INSTANCE************************//
    /**
     * Objectif : ajouter un compte à la liste
     *
     * @param : objet Compte
     */
    public void ajouterCompte(Compte compte){
        listeComptes.add(compte);
    }

    /**
     * Objectif : afficher les informations des comptes courants
     * TODO : écrire méthode
     */
    public void afficherCompteCourant(){
        for(Compte compte : listeComptes){
            if (compte instanceof CompteCourant){
                System.out.println("Compte courant de " + compte.getPrenom() + " : Solde de " + compte.getSold());
            }
        }
    }

    /**
     * Objectif : afficher les informations des comptes épargnes
     * TODO : écrire méthode
     */
    public void afficherCompteEpargne(){
        for(Compte compte : listeComptes){
            if (compte instanceof CompteEpargne){
                System.out.println("Compte epargne de " + compte.getPrenom() + " : Solde de " + compte.getSold());
            }
        }
    }

}
