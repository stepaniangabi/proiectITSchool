package obiectConstructor;

import java.util.List;

public class Masina {

//    Constructor

//    Constructor = are rol de a initializa variabilele unei clase
//    Cu alte cuvinte el stabileste valorile de pornire ale proprietatilor unui obiect

//    Cum recunoastem un constructor?
//    1. Numele constructorului este intotdeauna identic cu numele clasei
//    2. De cele mai multe ori constructorul este declarat ca public

//    Intr-o clasa putem avea mai multi constructori
//    Acestia se deosebesc intre ei prin: Numarul de parametrii sau tipul parametrilor

//    Important de stiut o clasa contine intotdeauna un constructor default

//    Constructorii pot fi de 2 tipuri: Constructori fara parametri (default) si constructori cu parametri(Acesta este definit de programator)

//    Obiect

//    Un obiect este instanta unei clase
//    Intr-o clasa putem definii oricate obiecte dorim
//    Obiectele se diferentiaza prin numele lor
//    Fiecare obiect poate avea valori diferite pentru aceleasi proprietati
//    Recunoastem un obiect dupa cuvantul cheie "new"
//    Structura generala este: tipObiect numeObiect = new tipObiect();
//    Exemplu concret Masina dacia = new Masina();

    public String marca;
    public String model;
    public int an;
    public String culoare;
    public List<String> dotariInterioare;
    public boolean electrica;
    public int pret;
    public int pretFinal;

    public Masina(String marca, String model, int an, String culoare, List<String> dotariInterioare, boolean electrica) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.culoare = culoare;
        this.dotariInterioare = dotariInterioare;
        this.electrica = electrica;
    }

    public Masina(String marca, String model, int an, String culoare, List<String> dotariInterioare, boolean electrica, int pret) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.culoare = culoare;
        this.dotariInterioare = dotariInterioare;
        this.electrica = electrica;
        this.pret = pret;
    }

    public void prezentareMasina() {
        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Anul masinii este: " + an);
        System.out.println("Culoarea masinii este: " + culoare);
        System.out.println("Dotarile masinii sunt: ");
        for (int index = 0; index < dotariInterioare.size(); index++) {
            System.out.println(dotariInterioare.get(index));
        }
        System.out.println("Este masina electrica?: " + electrica);
        calculPret();
//        if (pret!=0){
//            System.out.println("Pretul masinii este "+ pret);
//        }

//        Determinam impozitul in functie de anul de fabricatie
//        Primul caz < 2000 - 500 ron
//        Al doilea caz 2005 < X <2015 - 300 ron
//        Al treilea caz > 2015 - 100 ron

    }

    public void calculImpozit() {

        if (an <= 2000) {
            System.out.println("Impozitul pe masina este de 500 ron");
        } else if (an >= 2005 && an <= 2015) {
            System.out.println("Impozitul este 300 ron");
        } else if (an >= 2015) {
            System.out.println("Impozitul este 100 ron");
        }

    }

    public void calculPret() {
        if (pret != 0) {
            System.out.println("Pretul masinii este " + pret);
        }
        if (dotariInterioare.isEmpty()) {
            System.out.println("Pretul final este " + pret);
        } else {
            int dotari = 0;
            for (int index = 0; index < dotariInterioare.size(); index++) {
                switch (dotariInterioare.get(index)) {
                    case "-Aer conditionat":
                        dotari = dotari + 1000;
                        break;
                    case "-Incalzire in scaune":
                        dotari = dotari + 2000;
                        break;
                    case "-Dezaburire parbriz":
                        dotari = dotari + 3000;
                        break;
                }
            }
            pretFinal = pret + dotari;
            System.out.println("Pretul final este " + pretFinal);
        }
    }
}
