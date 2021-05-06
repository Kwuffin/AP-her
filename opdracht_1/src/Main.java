import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for farm name
        System.out.println("Hoe heet je boerderij?");
        String farm_name_user = sc.nextLine();

        // Create farm
        Boerderij boerderij = new Boerderij(farm_name_user);

        // Create stalls
        Kippenhok kippenhok = new Kippenhok("Kippenhok 1");
        Paardenstal paardenstal = new Paardenstal("Paardenstal 1");
        Koeienstal koeienstal = new Koeienstal("Koeienstal 1");

        // Add stalls to farm
        boerderij.add_stal(kippenhok);
        boerderij.add_stal(paardenstal);
        boerderij.add_stal(koeienstal);

        while (true) {
            System.out.println("""
                    ==========| Menu |==========\r
                    1. Maak nieuw dier\r
                    2. Zie overzicht boerderij""");
            String user_choice = sc.nextLine();

            // User chose to make new animal
            if (user_choice.equalsIgnoreCase("1")){
                // User can create their own animals
                System.out.println("Welk dier wil je maken?\n" +
                        "Keuze uit: 'Kip', 'Paard', 'Koe'");
                String animal_input = sc.nextLine(); // Read user input

                // If user chose to create a chicken:
                if (animal_input.equalsIgnoreCase("kip")) {

                    // User input for a name
                    System.out.println("Geef je kip een naam:");
                    String naam_input = sc.nextLine();

                    // User input for a color
                    System.out.println("Geef je kip een kleur:");
                    String kleur_input = sc.nextLine();

                    // User input for an age
                    System.out.println("Geef je kip een leeftijd:");
                    int leeftijd_input = Integer.parseInt(sc.nextLine());

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
                    int leeftijd_input = Integer.parseInt(sc.nextLine());

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
                    int leeftijd_input = Integer.parseInt(sc.nextLine());

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
                }
            }

        // If user wants to see information about farm
        else if (user_choice.equalsIgnoreCase("2")){

                // Farm toString()
                System.out.println("\n" + "===============| Informatie |===============\n" +
                        boerderij.toString() + ":\n");

                // For each stall in the farm:
                for (int i = 0; i < boerderij.getStallen().size(); i++){
                    System.out.println(boerderij.getStallen().get(i).toString());

                    // If there are any chicken in the stalls
                    if (kippenhok.getKippen().size() != 0 && i == 0){
                        for (int j = 0; j < kippenhok.getKippen().size(); j++){
                            System.out.println(kippenhok.getKippen().get(j).toString());
                        }
                    }

                    // If there are any horses in the stalls
                    else if (paardenstal.getPaarden().size() != 0 && i == 1){
                        for (int j = 0; j < paardenstal.getPaarden().size(); j++){
                            System.out.println(paardenstal.getPaarden().get(j).toString());
                        }
                    }

                    // If there are any cows in the stalls
                    else if (koeienstal.getKoeien().size() != 0 && i == 2){
                        for (int j = 0; j < koeienstal.getKoeien().size(); j++){
                            System.out.println(koeienstal.getKoeien().get(j).toString());
                        }
                    }
                    System.out.println("");
                }
            }
        }
    }
}