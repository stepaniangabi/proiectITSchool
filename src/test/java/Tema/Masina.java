package Tema;

import org.testng.annotations.Test;

public class Masina {

public String marca;
public String culoare;
public String model;
public int anFabricatie;
public int capacitateMotor;
public int nrKm;
public double pret;
public char tipCombustibil; // B=benzina    // M=motorina
public char cutieViteze;
public boolean esteSecondHand;

@Test
public void prezentareMasina () {
    marca = "Mercedes";
    culoare = "Negru";
    model = "G-Klass";
    anFabricatie = 2021;
    capacitateMotor = 4000;
    nrKm = 25000;
    pret = 120000.00;
    tipCombustibil = 'B'; // B=benzina
    cutieViteze = 'A'; // A=automata
    esteSecondHand = false;


    System.out.println(" Marca masinii este " + marca);
    System.out.println(" Culoarea masinii este " + culoare);
    System.out.println(" Modelul masinii este " + model);
    System.out.println(" Anul fabricatiei masinii este " + anFabricatie);
    System.out.println(" Capacitatea motorului masinii este " + capacitateMotor);
    System.out.println(" Nr de km ai masinii este " + nrKm);
    System.out.println(" Pretul masinii este " + pret);
    System.out.println(" Tipul de combustibi al masinii este " + tipCombustibil);
    System.out.println(" Cutia de viteze a masinii este " + cutieViteze);
    System.out.println(" Masina este second-hand? " + esteSecondHand);
}

}
