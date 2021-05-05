import java.util.ArrayList;

public class Koeienstal extends Stal{
    private ArrayList<Koe> koeien = new ArrayList<>();


    public Koeienstal(String nm) {
        super(nm);
    }

    public void add_koe(Koe koe){
        koeien.add(koe);
    }

    public ArrayList<Koe> getKoeien(){
        return koeien;
    }
}
