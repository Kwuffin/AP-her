public class BestNode implements Comparable<BestNode> {
    private Node node;
    private Double distance;

    public BestNode(Node node, Double distance) {
        this.node = node;
        this.distance = distance;
    }

    public Double getValue() {
        return distance;
    }

    public Node getKey() {
        return node;
    }

    public int compareTo(BestNode entry) {
        return this.getValue().compareTo(entry.getValue());
    }
}
