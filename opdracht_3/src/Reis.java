import java.util.*;

public class Reis extends Graph {
    private Node end_node;  // Destination node
    private List<Stap> steps = new ArrayList<>();  // Steps to get to destination node




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
