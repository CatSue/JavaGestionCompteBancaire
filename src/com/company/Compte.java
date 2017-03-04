package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Compte : classe définissant un compte
 * Compte = propriétaire, solde, découvert autorisé
 * Pas de setSolde() car pas de modification possible du solde
 *
 * @author Marie PÉTROD
 * @version 1.0
 */

public class Compte {

    //variable de classe qui va compter le nombre de comptes
    public static int nbreCompte = 0;

    //Nom du propriétaire du compte (variable d'instance)
    private String nom;

    //Prénom du propriétaire du compte (variable d'instance)
    private String prenom;

    //Numéros de compte (variable d'instance)
    private int numeroCompte;

    //liste
    private List<OperationBancaire> listeOperations = new ArrayList<OperationBancaire>();


    //************************CONSTRUCTEURS************************//
    /**
     * Objectif : créer un objet compte
     *
     * @param pNom : nom du propriétaire du compte
     * @param pPrenom : prénom du propriétaire du compte
     *
     */
    public Compte(final String pNom, final String pPrenom) {
        nbreCompte ++;
        numeroCompte = nbreCompte;
        nom = pNom;
        prenom = pPrenom;
    }

    //************************GETTEURS************************//
    /**
     * Objectif : renvoyer le solde du compte
     *
     * @return : valeur du solde du compte
     */
    public double getSold() {
        double Sold=0;
        for(OperationBancaire operation: listeOperations){
            if (operation.getTypeDeMouvement()== TypeOperation.CREDIT )   {
                Sold = Sold + operation.getMontant();
            } else Sold = Sold - operation.getMontant();
        }
        return Sold;
    }


    /**
     * Objectif : renvoyer le nom du propriétaire du compte
     *
     * @return : nom du propriétaire du compte
     */
    public String getNom() {
        return nom;
    }

    /**
     * Objectif : renvoyer le prénom du propriétaire du compte
     *
     * @return : prénom du propriétaire du compte
     */
    public String getPrenom() {
        return prenom;
    }


    /**
     * Objectif : modifier le nom de la personne
     *
     * @param pNom : nouveau nom de la personne
     */
    public void setNom(String pNom) {
        nom = pNom;
    }

    /**
     * Objectif : modifier le prénom de la personne
     *
     * @param pPrenom : nouveau prénom de la personne
     */
    public void setPrenom(String pPrenom) {
        prenom = pPrenom;
    }



    //************************METHODES D'INSTANCE************************//
    /**
     * Objectif : afficher les opérations sur le compte
     */
    protected void afficherListeOpe (){
        for(OperationBancaire operation: listeOperations) {
            double signe = 1;
            //if (listeOperations.size()== 0){
                //System.out.println("Pas d'operations effectuées sur votre compte");
            //}
            if (operation.getTypeDeMouvement()==TypeOperation.CREDIT ) {
                signe = 1;
            }
            else {
                signe = -1;
            }
            System.out.println("mouvement de " + operation.getTypeDeMouvement()+ "  montant = " + operation.getMontant()*signe);
        }
    }

    /**
     * Objectif : afficher le nom et le solde du compte
     */
    public void afficher(){
        {
            System.out.println(nom + " " + prenom);
            System.out.println("Solde du compte : "+ getSold());
        }
    }

    /**
     * Objectif : céditer le compte
     *
     * @param montant : somme à créditer
     * @return : nouveau solde du compte
     */
    public void crediter(double montant){
        OperationBancaire operation = new OperationBancaire(montant, TypeOperation.CREDIT);
        listeOperations.add(operation);
    }

    /**
     * Objectif : céditer le compte d'une somme qui vient d'un autre compte
     *
     */
    public void crediter(double montant,Compte compte) {
        this.crediter(montant);
        compte.debiter(montant);
    }

    /**
     * Objectif : débiter le compte
     *
     */
    public void debiter(double pSomme){
        OperationBancaire operation = new OperationBancaire(pSomme, TypeOperation.DEBIT);
        listeOperations.add(operation);
    }

    public void debiter(double montant, Compte compte) {
        debiter(montant);
        compte.crediter(montant);
    }

    @Override
    public String toString() {
        String lignesOperation="";
        for(OperationBancaire operation: listeOperations) {
            lignesOperation=lignesOperation+operation.toString() +"\n";
        }
        return  //"Compte\n" +
                //"Proprietaire='" + nom + '\'' +
                //"\n " +
                "Liste des operations \n" + lignesOperation;
                //+"\nSolde du compte = "+ getSold();
    }

}
