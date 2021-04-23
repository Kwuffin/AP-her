import java.util.ArrayList;

public class Stal {
    private String naam;
    private ArrayList<Kip> kippen = new ArrayList<>();
    private ArrayList<Paard> paarden = new ArrayList<>();
    private ArrayList<Koe> koeien = new ArrayList<>();


    public Stal(String nm){
        this.naam = nm;
    }

    public void add_kip(Kip kip){
        kippen.add(kip);
    }

    public void add_paard(Paard paard){
        paarden.add(paard);
    }

    public void add_koe(Koe koe){
        koeien.add(koe);
    }

    public String toString(){
        return String.format("%s heeft:\r\n%s kippen\r\n%s paarden\r\n%s koeien", naam, kippen.size(), paarden.size(), koeien.size());
    }

    public String getNaam() {
        return naam;
    }

    public ArrayList<Kip> getKippen() {
        return kippen;
    }

    public ArrayList<Paard> getPaarden() {
        return paarden;
    }

    public ArrayList<Koe> getKoeien() {
        return koeien;
    }
}
