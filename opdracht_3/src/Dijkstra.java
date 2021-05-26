/*
Code is based on https://www.baeldung.com/java-dijkstra
 */

import java.util.*;

public class Dijkstra {
    public static Graph calculateShortestPathFromSource(Graph graph, Node source) {
        source.setDistance(0.0);

        Set<Node> settledNodes = new HashSet<>();
        PriorityQueue<BestNode> unsettledNodes = new PriorityQueue<>();

        unsettledNodes.add(new BestNode(source, source.getDistance()));

        while (unsettledNodes.size() != 0) {
            Node currentNode = unsettledNodes.remove().getKey();

            for (Map.Entry<Node, Double> adjacencyPair:
                    currentNode.getAdjacentNodes().entrySet()) {
                Node adjacentNode = adjacencyPair.getKey();
                Stap step = new Stap(adjacencyPair.getValue(), currentNode.getMultiplier(adjacentNode));
                Double edgeWeight = step.getCost();

                if (!settledNodes.contains(adjacentNode)) {
                    calculateMinimumDistance(adjacentNode, edgeWeight, currentNode);
                    unsettledNodes.add(new BestNode(adjacentNode, adjacentNode.getDistance()));
                }
            }
            settledNodes.add(currentNode);
        }
        return graph;
    }


    private static Node getLowestDistanceNode(Set < Node > unsettledNodes) {
        Node lowestDistanceNode = null;
        Double lowestDistance = Double.MAX_VALUE;
        for (Node node: unsettledNodes) {
            Double nodeDistance = node.getDistance();
            if (nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestDistanceNode = node;
            }
        }
        return lowestDistanceNode;
    }

    private static void calculateMinimumDistance(Node evaluationNode,
                                                 Double edgeWeigh, Node sourceNode) {
        Double sourceDistance = sourceNode.getDistance();
        if (sourceDistance + edgeWeigh < evaluationNode.getDistance()) {
            evaluationNode.setDistance(sourceDistance + edgeWeigh);
            LinkedList<Node> shortestPath = new LinkedList<>(sourceNode.getShortestPath());
            shortestPath.add(sourceNode);
            evaluationNode.setShortestPath(shortestPath);
        }
    }
}
