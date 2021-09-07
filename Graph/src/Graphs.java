/*
*   Author: April Bollinger
*   Date: 5/2/2021
*   Program: Graph code
*   Purpose: to demonstrate a working graph through the debugger
*   Resources: 
*           https://algorithms.tutorialhorizon.com/graph-implementation-adjacency-list-better-set-2/
*           https://www.geeksforgeeks.org/implementing-generic-graph-in-java/
*           https://www.softwaretestinghelp.com/java-graph-tutorial/
*           https://medium.com/@mithratalluri/basic-graph-implementation-in-java-9ed12e328c57
*
*/


// importing the java Linkedlist class to be used in the graph.
import java.util.LinkedList;


public class Graphs {
    // Declaring some variables and types.
    int vertex;
    LinkedList <Integer> linkList[];

    // Contructor for the graph.
    // for a contructor the void must be left out of the class declaration.
    public Graphs(int vertex){
        this.vertex = vertex;
        linkList = new LinkedList[vertex];
        // For loop.
        for(int i = 0; i < vertex; i++){
            linkList[i] = new LinkedList<>();
        }
    }

    // method that adds the edges between the vertexes.
    public void edgeAdder(int Source, int Destination){

        // Adds the first edge for a directed graph such as a Binary Tree.
        linkList[Source].addFirst(Destination);

        // Adds the next edge that connects back to the original vertex to make it an undirected graph.
        linkList[Destination].addFirst(Source);
        
    }

    // Method to print out the relationships within the graph.
    public void Print(){
        for(int i = 0; i < vertex; i++){
            // Checking to make sure that there is something in the graph.
            // If true interates through and prints the source number of the vertex starting with the lowest number.
            if(linkList[i].size() > 0){
                // Sets up the message.
                System.out.print("Vertex " + i + " has an edge connected to: ");
                // Interates througn and finds the destination numbers related to that specific source number.
                for (int l = 0; l < linkList[i].size(); l++){
                    System.out.print(linkList[i].get(l) + " ");
                }

                // Line Break
                System.out.println();
            }
        }
    }


    // Main method that creates the graph, adds the vertexs and edges, and then calls the print method.
    public static void main(String[] args){
        // Creating the Graph.
        // The length of the graph can not be less than the highest source or destination number.
        Graphs graphcode = new Graphs (10);

        graphcode.edgeAdder(5, 5);
        graphcode.edgeAdder(5, 9);
        graphcode.edgeAdder(4,9);
        graphcode.edgeAdder(4,6);
        graphcode.edgeAdder(4,8);
        graphcode.edgeAdder(9,5);
        graphcode.edgeAdder(1,2);
        graphcode.edgeAdder(2,5);

        // Printing the graph.
        graphcode.Print();
    }
}
