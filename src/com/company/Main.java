package com.company;
import com.company.Compte;


/**
 * Main : classe principale.
 *
 * @author Marie PÉTROD
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {

/*        //création du compte de Nicolas
        Compte compteN = new Compte("TEST", "Nicolas");
        //création du compte de Jeremie
        Compte compteJ = new Compte("TEST", "Jeremie");
        compteN.crediter(1000);
        compteN.debiter(50);
        compteN.crediter(100);
        compteJ.debiter(500);
        compteJ.debiter(200,compteN);*/


        //création du compte courant de Nicolas
        CompteCourant compteCourantNicolas = new CompteCourant("TEST", "Nicolas", 2000.0);

        //création du compte courant de Jeremie
        CompteCourant compteCourantJeremie = new CompteCourant("TEST", "Jeremie", 500.0);

        //création du compte épargne de Nicolas
        CompteEpargne compteEpargneNicolas = new CompteEpargne("TEST", "Nicolas", 0.05);

        GestionDeComptes gestion = new GestionDeComptes();

        //ajout des comptes à la liste
        gestion.ajouterCompte(compteCourantNicolas);
        gestion.ajouterCompte(compteCourantJeremie);
        gestion.ajouterCompte(compteEpargneNicolas);

        //opérations
        compteCourantNicolas.crediter(1000);
        compteCourantNicolas.debiter(50);
        compteEpargneNicolas.crediter(200, compteCourantNicolas);
        compteCourantNicolas.crediter(100);
        compteEpargneNicolas.crediter(100, compteCourantNicolas);
        compteCourantJeremie.debiter(500);
        compteCourantNicolas.crediter(200, compteCourantJeremie);

        //affichage
        compteCourantNicolas.afficher();
        System.out.println(" ");
        compteEpargneNicolas.afficher();
        System.out.println(" ");
        compteCourantJeremie.afficher();



    }
}
