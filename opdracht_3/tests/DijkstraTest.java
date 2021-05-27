import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DijkstraTest {
    @Test
    public void calculateShortestPathFromSource() {
        // Create travel methods
        Travel_Method ride = new Travel_Method("car ride",1.00);
        Travel_Method train_ride = new Travel_Method("train ride", 1.3);
        Travel_Method flight = new Travel_Method("flight", 3.00);

        // Create nodes
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");

        // Set node attributes
        nodeA.addDestination(nodeB, 100.0);
        nodeA.add_Travel_Method(nodeB, ride);
        nodeA.addDestination(nodeC, 50.0);
        nodeA.add_Travel_Method(nodeC, flight);

        nodeB.addDestination(nodeD, 40.0);
        nodeB.add_Travel_Method(nodeD, flight);
        nodeB.addDestination(nodeF, 70.0);
        nodeB.add_Travel_Method(nodeF, train_ride);

        nodeC.addDestination(nodeE, 45.0);
        nodeC.add_Travel_Method(nodeE, train_ride);

        nodeD.addDestination(nodeF,10.0);
        nodeD.add_Travel_Method(nodeF, ride);
        nodeD.addDestination(nodeE,20.0);
        nodeD.add_Travel_Method(nodeE, ride);

        nodeF.addDestination(nodeE,50.0);
        nodeF.add_Travel_Method(nodeE, ride);

        // Add Nodes to graph
        Graph graph = new Graph();
        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeF);
        graph.addNode(nodeE);

        Node start_node = nodeA;
        Node end_node = nodeE;
        graph =  Dijkstra.calculateShortestPathFromSource(graph, start_node);
        // TODO: Put the code above in a @BeforeAll. I put it here for now just to get rid of the NullPointerException

        assertEquals(100, nodeB.getDistance());

    }
}