public class Koe implements Dier {
    private String naam;
    private String kleur;
    private int leeftijd;

    public Koe(String nm, String kl, int lf){
        this.naam = nm;
        this.kleur = kl;
        this.leeftijd = lf;
    }

    @Override
    public void maak_geluid() {
        System.out.println("De koe doet mooooooooooooooooooooooo");
    }
}


