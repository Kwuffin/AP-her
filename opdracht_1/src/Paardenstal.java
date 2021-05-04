import java.util.ArrayList;

public class Paardenstal extends Stal{
    private ArrayList<Paard> paarden = new ArrayList<>();


    public Paardenstal(String nm) {
        super(nm);
    }

    public void add_paard(Paard paard){
        paarden.add(paard);
    }
}
