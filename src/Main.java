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

        Stal paardenstal = new Stal("Paardenstal");

        Stal koeienstal = new Stal("Koeienstal");


        // Initialize farm
        Boerderij boerderij = new Boerderij("Boerderij");


    }
}
