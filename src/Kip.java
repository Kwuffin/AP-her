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
    public void maak_geluid(){
        System.out.println("Het kip doet tok tok tok");
    }

}
