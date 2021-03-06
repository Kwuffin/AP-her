/*
Code is based on https://www.baeldung.com/java-dijkstra
 */

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Node {
    private String name;
    private List<Node> shortestPath = new LinkedList<>();
    private Double distance = Double.MAX_VALUE;
    Map<Node, Double> adjacentNodes = new HashMap<>();
    private Map<Node, Travel_Method> travel_options = new HashMap<>();

    public Node(String name) {
        this.name = name;
    }

    public void addDestination(Node destination, Double distance) {
        adjacentNodes.put(destination, distance);
    }

    public void add_Travel_Method(Node destination, Travel_Method travel_method){
        travel_options.put(destination, travel_method);
    }

    // getters and setters
    public Double getMultiplier(Node node) {
        Travel_Method travel_method = travel_options.get(node);
        return travel_method.getMultiplier();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Node> getShortestPath() {
        return shortestPath;
    }

    public void setShortestPath(List<Node> shortestPath) {
        this.shortestPath = shortestPath;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Map<Node, Double> getAdjacentNodes() {
        return adjacentNodes;
    }

    public void setAdjacentNodes(Map<Node, Double> adjacentNodes) {
        this.adjacentNodes = adjacentNodes;
    }

    public String toString() {
        return String.format("This is Node '%s'", name);
    }

}