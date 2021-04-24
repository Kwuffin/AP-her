public class Kip implements Dier {
    private String naam;
    private String kleur;
    private int leeftijd;

    public Kip(String nm, String kl, int lf){
        this.naam = nm;
        this.kleur = kl;
        this.leeftijd = lf;
    }

    @Override
    public String maak_geluid(){
        return "Het kip doet tok tok tok";
    }

}
