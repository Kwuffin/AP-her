public class Paard implements Dier {
    private String naam;
    private String kleur;
    private int leeftijd;

    public Paard(String nm, String kl, int lf){
        this.naam = nm;
        this.kleur = kl;
        this.leeftijd = lf;
    }

    @Override
    public String maak_geluid(){
        return "Het paard doet BFFFFRRRRTTTT";
    }

}

