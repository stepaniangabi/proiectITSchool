package structuriAlternative;

import org.testng.annotations.Test;

public class structuriAlternative {

    //In programare exista 2 tipuri de structuri: alternative si repetitive
    //Structuri alternative: if ... then ... else/switch ... case

    // if - conditia pentru variabila

    @Test
    public void metodaTest() {

//        verificaPersoanaMajora(16);
//        verificaPersoanaMajora(21);
//        verificareNumarPar(25);
//        verificareNumarPar(20);
        zileleSaptamanii(0);
    }

    public void verificaPersoanaMajora(int varsta) {

        if (varsta >= 18) {
            System.out.println("persoana cu varsta de " + varsta + " este majora.");
        } else {
            System.out.println("persoana cu varsta de " + varsta + " este minora.");
        }
    }

    public void verificareNumarPar(int numar) {

        if (numar % 2 == 0) {
            System.out.println(numar + " este numar par");

        } else {
            System.out.println(numar + " este numar impar");
        }
    }

    public void zileleSaptamanii(int zi) {
        switch (zi) {

            case 1:
                System.out.println("Astazi este luni");
                break;
            case 2:
                System.out.println("Astazi este marti");
                break;
            case 3:
                System.out.println("Astazi este miercuri");
                break;
            case 4:
                System.out.println("Astazi este joi");
                break;
            case 5:
                System.out.println("Astazi este vineri");
                break;
            case 6:
                System.out.println("Astazi este sambata");
                break;
            case 7:
                System.out.println("Astazi este duminica");
                break;
            default:
                System.out.println("Nu mai exista zile");
        }
    }
}

//tema: Verificăm dacă un număr este pozitiv și divizibil cu 5.
// switch case se foloseste pt a naviga in meniuri
//la if compilatorul evalueaza fiecare conditie pas cu pas
//la switch compilatorul sare direct la valoarea pe care i am dat-o ca si perimetru

