public abstract class Travel_Method {
    Double multiplier;
    String name;

    public Travel_Method(String name, Double multiplier) {
        this.name = name;
        this.multiplier = multiplier;
    }

    public Double getMultiplier() {
        return multiplier;
    }

    public String toString(){
        return String.format("This is ride '%s'", name);
    }
}
