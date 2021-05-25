public class Vlucht {
    Double multiplier;
    String name;

    public Vlucht(String name) {
        this.name = name;
        this.multiplier = 2.0;
    }

    public Double getMultiplier() {
        return multiplier;
    }

    public String toString(){
        return String.format("This is vlucht '%s'", name);
    }
}
