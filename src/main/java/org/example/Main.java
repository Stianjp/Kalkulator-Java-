package org.example;
/*Oppgavetekst:
Skriv en Java-kode for en enkel kalkulator som kan utføre følgende operasjoner:
addisjon, subtraksjon, multiplikasjon og divisjon. Be brukeren om å angi to tall og
en operator (+, -, *, /). Deretter skal programmet utføre den valgte operasjonen og vise resultatet.

Her er et eksempel på hvordan programmet kan se ut i pseudokode:

Spør brukeren om å angi det første tallet (lagre det som tall1).
Spør brukeren om å angi operatøren (+, -, *, /) (lagre den som operator).
Spør brukeren om å angi det andre tallet (lagre det som tall2).
Utfør den valgte operasjonen avhengig av operatøren og vis resultatet.

 */


import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        /*Bruker setter verdi til tallene*/
        double tall1 = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn et tall, desimaler er tillat"));
        String operator = JOptionPane.showInputDialog("Skriv inn hva du vil gjøre (*,/,+,-)");
        double tall2 = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn ett tall til, desimaler er tillat"));

        if (operator.equals("+")){
            double addisjon = tall1+tall2;
            System.out.println(tall1 + " + "+ tall2 + " = " + addisjon);
        } else if (operator.equals("/")) {
            if (tall2 == 0){
                System.out.println("Du kan ikke dele på 0, prøv igjen");
            }else {
                double derivasjon = tall1/tall2;
                System.out.println(tall1 + " / " + tall2 + " = "+derivasjon);
            }
        } else if (operator.equals("-")) {
            double subtrasjon = tall1 - tall2;
            System.out.println(tall1 + " - " + tall2 + " = "+subtrasjon);
        } else if (operator.equals("*")) {
            double multiplikasjon = tall1*tall2;
            System.out.println(tall1 + " * " + tall2 + " = " + multiplikasjon);
        }
        else {
            System.out.println("Du har skrevet feil variabel");
        }
    }
}
