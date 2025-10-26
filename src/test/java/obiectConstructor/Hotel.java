package obiectConstructor;

import java.util.List;

public class Hotel {
//    Creează o clasă Java numită Hotel, care să descrie un hotel și să conțină următoarele variabile :
//nume,adresa,oras,tara,numar stele,facilitati
//
//creeaza un constructor care primeste toti cesti parametrii is ii atribuie proprietatilor din clasa.
//
//Creeaza o metoda publica care afiseaza toate informatiile despre hotel in consola , in format clar :
//
//Creeaza o metoda publica care calculeaza si afiseaza pretul camerei in functie de numarul de stele:
//
//- 1 stea -> 100 ron
//- 2 stele -> 200 ron
//- 3 stele -> 300 ron
//
//daca are alt numar de stele -> afiseaza nu mesaj : "clasificare necunoscuta, nu e poate calcula pretul"
//
//
//Faceti o clasa HotelTest
//
//Creaza o metoda de test
//
//Creaza 3 obiecte de tip Hotel , fiecare cu un numar diferit de stele si facilitate propria .
//
//Pentru fiecare hotel apeleaza :
//- metoda prezentareHotel();
//- metoda calculeazaPretCamera();

    public String nume;
    public String adresa;
    public String oras;
    public String tara;
    public int numarStele;
    public List<String> facilitati;

    // Constructor cu parametri
    public Hotel(String nume, String adresa, String oras, String tara, int numarStele, List<String> facilitati) {
        this.nume = nume;
        this.adresa = adresa;
        this.oras = oras;
        this.tara = tara;
        this.numarStele = numarStele;
        this.facilitati = facilitati;
    }

    // Metoda care afiseaza toate informatiile despre hotel
    public void prezentareHotel() {
        System.out.println("Numele hotelului este: " + nume);
        System.out.println("Adresa hotelului este: " + adresa);
        System.out.println("Orasul: " + oras);
        System.out.println("Tara: " + tara);
        System.out.println("Numarul de stele: " + numarStele);
        System.out.println("Facilitatile hotelului sunt:");
        for (int index = 0; index < facilitati.size(); index++) {
            System.out.println(facilitati.get(index));
        }
    }

    // Metoda care calculeaza si afiseaza pretul camerei in functie de numarul de stele
    public void calculeazaPretCamera() {
        switch (numarStele) {
            case 1:
                System.out.println("Pretul camerei este: 100 RON/noapte");
                break;
            case 2:
                System.out.println("Pretul camerei este: 200 RON/noapte");
                break;
            case 3:
                System.out.println("Pretul camerei este: 300 RON/noapte");
                break;
            default:
                System.out.println("Clasificare necunoscuta, nu se poate calcula pretul.");
                break;
        }
    }
}
}
