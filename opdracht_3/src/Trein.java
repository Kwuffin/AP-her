public class Trein {
    Double multiplier;
    String name;

    public Trein(String name) {
        this.name = name;
        this.multiplier = 1.2;
    }

    public Double getMultiplier() {
        return multiplier;
    }

    public String toString(){
        return String.format("This is train '%s'", name);
    }
}
