import java.util.ArrayList;

public class Kippenhok extends Stal {
    private ArrayList<Kip> kippen = new ArrayList<>();


    public Kippenhok(String nm) {
        super(nm);
    }

    public void add_kip(Kip kip){
        kippen.add(kip);
    }

    public String toString(){
        return String.format("Dit is %s:\n" +
                "%s heeft %s kip(pen).", getNaam(), getNaam(), kippen.size());
    }

    public ArrayList<Kip> getKippen() {
        return kippen;
    }
}
