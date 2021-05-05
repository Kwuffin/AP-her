import java.util.ArrayList;

public class Boerderij {
    private String naam;
    private ArrayList<Stal> stallen = new ArrayList<>();

    public Boerderij(String nm){
        this.naam = nm;
    }

    public void add_stal(Stal stal){
        stallen.add(stal);
    }

    public String toString(){
        return String.format("%s heeft %s stallen", naam, stallen.size());
    }


    // Setters and Getters
    public String getNaam() {
        return naam;
    }

    public ArrayList<Stal> getStallen() {
        return stallen;
    }

}
