package com.company;

/**
 * OperationBancaire : classe définissant une opération bancaire
 * Opération bancaire = montant, type de mouvement, date
 *
 * @author Marie PÉTROD
 * @version 1.0
 */

public class OperationBancaire {
    //montant de l'opération bancaire
    private double montant;

    //Type de mouvement
    private TypeOperation typeDeMouvement;


    //************************CONSTRUCTEURS************************//
    public OperationBancaire(double pMontant,TypeOperation pTypeDeMouvement ) {
        montant = pMontant;
        typeDeMouvement = pTypeDeMouvement;
    }

    //************************GETTEURS************************//
    public double getMontant() {
        return montant;
    }

    public TypeOperation getTypeDeMouvement() {
        return typeDeMouvement;
    }

    //************************SETTEURS************************//
    public void setMontant(double pMontant) {
        montant = pMontant;
    }

    //************************METHODES D'INSTANCE************************//
    @Override
    public String toString() {
        double signe=1;
        if (typeDeMouvement==TypeOperation.CREDIT ) {
            signe=1;
        }
        else {
            signe=-1;
        }
        // +"mouvement de " + operation.getTypeDeMouvement()+ "  montant = " + operation.getMontant()*signe + "\n";
        return  "mouvement de " + typeDeMouvement +
                " montant = " + montant*signe ;
    }
}
