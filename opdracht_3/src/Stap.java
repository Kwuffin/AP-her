public class Stap {
    private int step_id;
    private Reis reis;
    private Double cost;  // The 'score' of a step.

    // Calculate the score of a step
    public Stap(Double distance, Double multiplier) {
        this.cost = distance * multiplier;
    }

    public String toString() {
        return "Step #" + step_id;
    }


    // Getters and setters
    public int getStep_id() {
        return step_id;
    }

    public void setStep_id(int step_id) {
        this.step_id = step_id;
    }

    public Reis getReis() {
        return reis;
    }

    public void setReis(Reis reis) {
        this.reis = reis;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
