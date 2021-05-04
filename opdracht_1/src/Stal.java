import java.util.ArrayList;

public abstract class Stal {
    private String naam;


    public Stal(String nm){
        this.naam = nm;
    }

    public String toString(){
        return String.format("Dit is stal: '%s'", naam);
    }

    // Setters and Getters
    public String getNaam() {
        return naam;
    }
}
