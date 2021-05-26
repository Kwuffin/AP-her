public class Main {
    public static void main(String[] args)
    {
        Test();

    }

    private static void Test()
    {
        Travel_Method ride = new Travel_Method("car rice",1.00);
        Travel_Method train_ride = new Travel_Method("train ride", 1.5);
        Travel_Method flight = new Travel_Method("flight", 3.00);

        // Create nodes
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");

        // Set node attributes
        nodeA.addDestination(nodeB, 10.00);
        nodeA.add_Travel_Method(nodeB, ride);
        nodeA.addDestination(nodeC, 30.00);
        nodeA.add_Travel_Method(nodeC, flight);

        nodeB.addDestination(nodeD, 30.00);
        nodeB.add_Travel_Method(nodeD, train_ride);
        nodeB.addDestination(nodeF, 20.00);
        nodeB.add_Travel_Method(nodeF,ride);

        nodeC.addDestination(nodeE, 15.00);
        nodeC.add_Travel_Method(nodeE, train_ride);

        nodeD.addDestination(nodeF,2.00);
        nodeD.add_Travel_Method(nodeF, ride);
        nodeD.addDestination(nodeE,5.00);
        nodeD.add_Travel_Method(nodeE, ride);

        nodeF.addDestination(nodeE,15.00);
        nodeF.add_Travel_Method(nodeE, ride);

        // Add Nodes to graph
        Graph graph = new Graph();
        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeF);
        graph.addNode(nodeE);

        Node start_node = nodeA;  // Source node TODO: Make user variable in the future
        Node end_node = nodeE;  // Destination node TODO: Make user variable in the future
        graph =  Dijkstra.calculateShortestPathFromSource(graph, start_node);

        Reis reis = new Reis(nodeE);
        reis.setSteps(reis);

        System.out.println("Total distance: "+reis.getDistance()+"\n");
        System.out.println("Route:");
        for (Node nd : end_node.getShortestPath()) {
            System.out.println(nd.toString());
        }

        System.out.println(end_node.toString());
    }
}
