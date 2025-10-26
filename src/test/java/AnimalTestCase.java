import org.testng.annotations.Test;

public class AnimalTestCase {

    public String tipAnimal;
    public boolean mamifer;
    public int varsta;
    public double greutate;

    @Test

    public void metodeTest() {

//        tipAnimal = "Caine";
//        mamifer = true;
//        varsta = 5;
//        greutate = 25.7;

        prezentareAnimal("Caine", true, 5, 25.7);
        prezentareAnimal("Pisica", true, 8, 5.9);
        prezentareAnimal("Porumbel", false, 2, 0.78);


    }

    public void prezentareAnimal(String tipAnimal, boolean mamifer, int varsta, double greutate) {

        System.out.println("Animalul este: " + tipAnimal + ". " );
        System.out.println("Animalul este mamifer: " + mamifer + ". ");
        System.out.println("Varsta animalului este: " + varsta + ". ");
        System.out.println("Greutatea animalului este: " + greutate + ". ");
    }
}
