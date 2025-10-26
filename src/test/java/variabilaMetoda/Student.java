package variabilaMetoda;

import org.testng.annotations.Test;

public class Student {

    //o clasa este un sablon care defineste comportamentul unei entitatti din viata reala
    //intr-un fisier Java recunoastem o clasa dupa cuvantul chheie "class"
    //o clasa este obligatoriu sa aiba un nume
    //o clasa contine variabile si metode
    // o variabila este proprietatea unei clase (nume, prenume, varsta)
    //o variabila poate fii de 2 feluri: globala si locala
    //globala=variabila pe care o declaram la inceputul clasei si e vizibila in tot fisierul
    //locala=variabila pe care o declaram in interiorul unuei metode si e vizibla doar acolo
    //o variabila globala trebuie sa contina un access control (public), tip de data si un nume
    //o variabila nu trebuie sa contina tot timpul o valoare

    public String nume;
    public String prenume;
    public int varsta;
    public double inaltime;
    public float greutate;
    public String adresa;
    public char sex;
    public boolean areRestante;


    //o metoda este actiunea unei clase (invata, merge la cursuri, etc)
    //o clasa poate avea mai multe metode care se diferentiaza prin numele lor
    //metodele pot fi de 2 feluri: void si return
    //o metoda cu void are ca rol sa execute actiunea si sa o afiseze
    //o metoda cu void trebuie sa contina access control (public), cuvantul cheie "void", numele metodei () si {}
    @Test
    public void prezentareStudent() {
        nume = "Stepanian";
        prenume = "Gabriella";
        varsta = 27;
        inaltime = 1.70;
        greutate = 54.5f;
        adresa = "Strada Martir Ovidiu Munteanu";
        sex = 'f';
        areRestante = false;

        //ca sa selectezi tot textul apesi pe ctrl A
        // ca sa aliez tot codul apesi ctrl alt L
        // ctrl+Z revine la era inainte

        //System.out.print(nume+" "+prenume+" "+varsta+" "+inaltime+" "+greutate+" "+adresa+" "+sex+" "+areRestante+" ");
        //System.out.print(prenume+" ");
        //System.out.print(varsta+" ");
        //System.out.print(inaltime+" ");
        //System.out.print(greutate+" ");
        //System.out.print(adresa+" ");
        //System.out.print(sex+" ");
        //System.out.print(areRestante+" ");

        //concatenarea este lipirea a unuia sau mai multe stringuri si liporea se face cu "+" si spatiu intre
        //ctrl / daca selectez tot si vreau sa pun in comentarii

        System.out.println("numele studentului este "+nume);
        System.out.println("prenume studentului este "+prenume);
        System.out.println("varsta studentului este "+varsta);
        System.out.println("inatltime studentului este "+inaltime);
        System.out.println("greutate studentului este "+greutate);
        System.out.println("sexul studentului este "+sex);
        System.out.println("are studentul resante? este "+areRestante);

        //print inseamna ca afiseaza valoarea si ramane pe randul curent-informatia e in sir
        //println inseamna ca afiseaza valoarea si sare la randul urmator (pt aerisire)
    }

}
