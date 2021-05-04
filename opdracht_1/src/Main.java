import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Welk dier wil je maken?\n" +
                    "Keuze uit: 'Kip', 'Paard', 'Koe'");

            String animal_input = sc.nextLine(); // Read user input

            if (animal_input.equalsIgnoreCase("kip")) {
                System.out.println("Geef je kip een naam:");
                String naam_input = sc.nextLine();

                System.out.println("Geef je kip een kleur:");
                String kleur_input = sc.nextLine();

                System.out.println("Geef je kip een leeftijd:");
                int leeftijd_input = sc.nextInt();

                Kip user_kip = new Kip(naam_input, kleur_input, leeftijd_input);
            }

            else if (animal_input.equalsIgnoreCase("paard")) {
                System.out.println("Geef je paard een naam:");
                String naam_input = sc.nextLine();

                System.out.println("Geef je paard een kleur:");
                String kleur_input = sc.nextLine();

                System.out.println("Geef je paard een leeftijd:");
                int leeftijd_input = sc.nextInt();

                Paard user_paard = new Paard(naam_input, kleur_input, leeftijd_input);
            }

            else if (animal_input.equalsIgnoreCase("koe")) {
                System.out.println("Geef je koe een naam:");
                String naam_input = sc.nextLine();

                System.out.println("Geef je koe een kleur:");
                String kleur_input = sc.nextLine();

                System.out.println("Geef je koe een leeftijd:");
                int leeftijd_input = sc.nextInt();

                Koe user_koe = new Koe(naam_input, kleur_input, leeftijd_input);
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