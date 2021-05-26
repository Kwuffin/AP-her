import java.util.*;

public class Reis extends Graph {
    private Node end_node;  // Destination node
    private List<Stap> steps = new ArrayList<>();  // Steps to get to destination node

    public Reis(Node end_node) {
        this.end_node = end_node;
        List<Stap> step_list = new ArrayList<>();

        // List of the shortest path to `end_node`
        ArrayList<Node> nodes = new ArrayList<>(end_node.getShortestPath());
        nodes.add(end_node);  // Add the last node to the list.

        // For each step until the end_node
        for (int i = 0; i < nodes.size() -1; i++) {
            Node current_node = nodes.get(i);  // Loop through node in the path
            Node next_node = nodes.get(i + 1);  // Loop through the next node in the path

            // Map with the adjacent Node and the between the Nodes distance
            Map<Node, Double> nodeDict = current_node.getAdjacentNodes();
            Double value = nodeDict.get(next_node);

            Stap step = new Stap(value, current_node.getMultiplier(next_node));
            step.setStep_id(i);
            steps.add(step);  // Add the step to the steps
        }
    }

    public void addSteps(Stap step) {
        steps.add(step);
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
                System.out.printf("Step %s: - Cost: %s%n%n", step.getStep_id() + 1, step.getCost());
                distance += step.getCost();
            }

        }
        return distance;
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
}
