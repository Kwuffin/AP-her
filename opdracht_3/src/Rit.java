public class Rit {
    Double multiplier;
    String name;

    public Rit(String name) {
        this.name = name;
        this.multiplier = 1.0;
    }

    public Double getMultiplier() {
        return multiplier;
    }

    public String toString(){
        return String.format("This is ride '%s'", name);
    }
}
