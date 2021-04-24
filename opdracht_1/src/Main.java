public class Main {

    public static void main(String[] args) {

        // Initialize animals
        Kip kip1 = new Kip("Kip1", "Wit", 1);
        Kip kip2 = new Kip("Kip2", "Bruin", 2);
        Kip kip3 = new Kip("Kip3", "Wit", 2);

        Paard paard1 = new Paard("Paard1", "Zwart", 4);
        Paard paard2 = new Paard("Paard2", "Zwart", 2);
        Paard paard3 = new Paard("Paard3", "Bruin", 8);

        Koe koe1 = new Koe("Koe1", "Bruin", 4);
        Koe koe2 = new Koe("Koe2", "Zwart", 3);
        Koe koe3 = new Koe("Koe3", "Bruin", 6);


        // Initialize stalls
        Stal kippenhok = new Stal("Kippenhok");
        kippenhok.add_kip(kip1);
        kippenhok.add_kip(kip2);
        kippenhok.add_kip(kip3);

        Stal paardenstal = new Stal("Paardenstal");
        paardenstal.add_paard(paard1);
        paardenstal.add_paard(paard2);
        paardenstal.add_paard(paard3);

        Stal koeienstal = new Stal("Koeienstal");
        koeienstal.add_koe(koe1);
        koeienstal.add_koe(koe2);
        koeienstal.add_koe(koe3);

        // Initialize farm
        Boerderij boerderij = new Boerderij("Boerderij de heuvel");
        boerderij.add_stal(kippenhok);
        boerderij.add_stal(paardenstal);
        boerderij.add_stal(koeienstal);

        System.out.println(boerderij);
        for (int i = 0; i < boerderij.getStallen().size(); i ++){
            System.out.println(boerderij.getStallen().get(i).toString() + "\r\n");
            }

        // Print kippenhok
        System.out.println("Kippen in " + kippenhok.getNaam() + ":");
        for (int i = 0; i < kippenhok.getKippen().size(); i ++){
            System.out.println(kippenhok.getKippen().get(i));
        }
        System.out.println(kip1.maak_geluid() + "\n");

        // Print paardenstl
        System.out.println("Paarden in " + paardenstal.getNaam() + ":");
        for (int i = 0; i < paardenstal.getPaarden().size(); i ++){
            System.out.println(paardenstal.getPaarden().get(i));
        }
        System.out.println(paard1.maak_geluid() + "\n");

        // Print koeienstal
        System.out.println("Koeien in " + koeienstal.getNaam() + ":");
        for (int i = 0; i < koeienstal.getKoeien().size(); i ++){
            System.out.println(koeienstal.getKoeien().get(i));
            }
        System.out.println(koe1.maak_geluid() + "\n");

        }
        
    }
