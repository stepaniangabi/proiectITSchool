import org.testng.annotations.Test;

public class Exercitii {
@Test
    public void metodaTest() {

        listareDeNumere();
    }

    //alelggem o lista de nr
//FOR cu array (array=enumerare)
    public void listareDeNumere() {
        int[] listaDeNumere = {1, 2, 23, 45, 56};

        for (int index = 0 ; index <= 4 ; index++) {
            System.out.println("Afisam numarul: " + listaDeNumere[index]);
        }

//        FOR EACH: din listaDeNumere itera prin fiecare element pe care il numim numar
        for(int numar: listaDeNumere){
            System.out.println("Afisam numarul: " + numar);
        }

    }
}
