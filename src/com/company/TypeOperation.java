package com.company;

/**
 * TypeOperation : énumération des différents types d'opérations
 * Crédit
 * Débit
 *
 * @author Marie PÉTROD
 * @version 1.0
 */

public enum TypeOperation {
    CREDIT("Credit"),
    DEBIT("Debit");

    private String val;

    TypeOperation(final String pVal) {
        val = pVal;
    }

    public String toString() {
        return val;
    }

}
