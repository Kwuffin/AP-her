import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create stalls
        Kippenhok kippenhok = new Kippenhok("Kippenhok 1");
        Paardenstal paardenstal = new Paardenstal("Paardenstal 1");
        Koeienstal koeienstal = new Koeienstal("Koeienstal 1");

        while (true) {

            // User can create their own animals
            System.out.println("Welk dier wil je maken?\n" +
                    "Keuze uit: 'Kip', 'Paard', 'Koe'");

            String animal_input = sc.nextLine(); // Read user input

            if (animal_input.equalsIgnoreCase("kip")) {

                // User input for a name
                System.out.println("Geef je kip een naam:");
                String naam_input = sc.nextLine();

                // User input for a color
                System.out.println("Geef je kip een kleur:");
                String kleur_input = sc.nextLine();

                // User input for an age
                System.out.println("Geef je kip een leeftijd:");
                int leeftijd_input = sc.nextInt();

                // If chicken stall is full, don't create animal
                if (kippenhok.getKippen().size() >= 5){
                    System.out.println("Kippenhok zit vol!");
                    continue;
                }

                // Create animal
                Kip user_kip = new Kip(naam_input, kleur_input, leeftijd_input);

                // Append animal to stall
                kippenhok.add_kip(user_kip);
            }

            else if (animal_input.equalsIgnoreCase("paard")) {

                // User input for a name
                System.out.println("Geef je paard een naam:");
                String naam_input = sc.nextLine();

                // User input for a color
                System.out.println("Geef je paard een kleur:");
                String kleur_input = sc.nextLine();

                // User input for an age
                System.out.println("Geef je paard een leeftijd:");
                int leeftijd_input = sc.nextInt();

                // If horsestall is full, don't create animal
                if (paardenstal.getPaarden().size() >= 5){
                    System.out.println("Paardenstal zit vol!");
                    continue;
                }

                // Create animal
                Paard user_paard = new Paard(naam_input, kleur_input, leeftijd_input);

                // Append animal to stall
                paardenstal.add_paard(user_paard);
            }

            else if (animal_input.equalsIgnoreCase("koe")) {
                // User input for a name
                System.out.println("Geef je koe een naam:");
                String naam_input = sc.nextLine();

                // User input for a color
                System.out.println("Geef je koe een kleur:");
                String kleur_input = sc.nextLine();

                // User input for an age
                System.out.println("Geef je koe een leeftijd:");
                int leeftijd_input = sc.nextInt();

                // If cowstall is full, don't create animal
                if (koeienstal.getKoeien().size() >= 5){
                    System.out.println("Koeienstal zit vol!");
                    continue;
                }

                // Create animal
                Koe user_koe = new Koe(naam_input, kleur_input, leeftijd_input);

                // Append animal to stall
                koeienstal.add_koe(user_koe);
            }

            else {
                System.out.println("Ongeldige invoer!");
                continue;
            }


//        // Initialize stalls
//        Stal kippenhok = new Stal("Kippenhok");
//        kippenhok.add_kip(kip1);
//        kippenhok.add_kip(kip2);
//        kippenhok.add_kip(kip3);
//
//        Stal paardenstal = new Stal("Paardenstal");
//        paardenstal.add_paard(paard1);
//        paardenstal.add_paard(paard2);
//        paardenstal.add_paard(paard3);
//
//        Stal koeienstal = new Stal("Koeienstal");
//        koeienstal.add_koe(koe1);
//        koeienstal.add_koe(koe2);
//        koeienstal.add_koe(koe3);
//
//        // Initialize farm
//        Boerderij boerderij = new Boerderij("Boerderij de heuvel");
//        boerderij.add_stal(kippenhok);
//        boerderij.add_stal(paardenstal);
//        boerderij.add_stal(koeienstal);
//
//        System.out.println(boerderij);
//        for (int i = 0; i < boerderij.getStallen().size(); i ++){
//            System.out.println(boerderij.getStallen().get(i).toString() + "\r\n");
//            }
//
//        // Print kippenhok
//        System.out.println("Kippen in " + kippenhok.getNaam() + ":");
//        for (int i = 0; i < kippenhok.getKippen().size(); i ++){
//            System.out.println(kippenhok.getKippen().get(i));
//        }
//        System.out.println(kip1.maak_geluid() + "\n");
//
//        // Print paardenstl
//        System.out.println("Paarden in " + paardenstal.getNaam() + ":");
//        for (int i = 0; i < paardenstal.getPaarden().size(); i ++){
//            System.out.println(paardenstal.getPaarden().get(i));
//        }
//        System.out.println(paard1.maak_geluid() + "\n");
//
//        // Print koeienstal
//        System.out.println("Koeien in " + koeienstal.getNaam() + ":");
//        for (int i = 0; i < koeienstal.getKoeien().size(); i ++){
//            System.out.println(koeienstal.getKoeien().get(i));
//            }
//        System.out.println(koe1.maak_geluid() + "\n");

        }
    }
}