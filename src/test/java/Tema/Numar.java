package Tema;

import org.testng.annotations.Test;

@Test
public class Numar {
    @Test
    public void metodaTest() {
        verificareDivizibilitate(10, 2);
        verificareDivizibilitate(5, 10);
        verificareDivizibilitate(5, 2);
        verificareNumarPozitiv(3);
        daSauNu();
    }

    public void daSauNu() {
        if (5 % 5 == 0) {
            System.out.println("DA");
        } else {
            System.out.println("NU");
        }
    }

    public void verificareDivizibilitate(int dividend, int divizor) {
        if (dividend % divizor == 0) {
            System.out.println(dividend + " " + "este divizibil cu:" + " " + divizor);
        } else {
            System.out.println(dividend + " " + "nu este divizibil cu:" + " " + divizor);
        }
    }

    public void verificareNumarPozitiv(int numarDeVerificat) {
        if (numarDeVerificat >= 0) {
//            System.out.printf("%d este pozitiv", numarDeVerificat);
            System.out.println(numarDeVerificat + " " + "este pozitiv");
        } else {
            System.out.println(numarDeVerificat + " " + "este negativ");
        }
    }

}

