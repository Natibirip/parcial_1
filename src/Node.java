public class Node {
    PrintJob data; // El dato que guarda
    Node next;     // Puntero que va a siguiente nodo

    public Node(PrintJob data) {
        this.data = data;
        this.next = null;
    }
}