import java.util.*;

public class Reis extends Graph {
    private Node end_node;  // Destination node
    private List<Stap> steps = new ArrayList<>();  // Steps to get to destination node

    public Reis(Node end_node) {
        this.end_node = end_node;

        List<Stap> steps = new ArrayList<>();

        // List of the shortest path to `end_node`
        ArrayList<Node> nodes = new ArrayList<Node>(end_node.getShortestPath());
        nodes.add(end_node);  // Add the last node to the list.
    }

    // For each step, define the way to get there
    public void setSteps(Reis reis) {
        for (Stap step : steps) {
            step.setReis(reis);
        }
    }

    public Double getDistance() {
        Double distance = 0.0;
        if (steps.size() >= 1) {
            for (Stap step : steps) {
                System.out.printf("Step %s: - Cost: %s%n", step.getStep_id() + 1, step.getCost());
                distance += step.getCost();
            }
            return distance;
        }
        else {
            return null;
        }
    }

    public String toString() {
        StringBuilder steps_string = new StringBuilder();
        for (Stap step : steps) {
            steps_string.append(step);
        }
        return steps_string.toString();
    }


    // Getters and setters
    public Node getEnd_node() {
        return end_node;
    }

    public void setEnd_node(Node end_node) {
        this.end_node = end_node;
    }

    public List<Stap> getSteps() {
        return steps;
    }

    public void setSteps(List<Stap> steps) {
        this.steps = steps;
    }
}
