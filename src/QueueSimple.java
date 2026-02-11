public class QueueSimple {
    private Node head; // Frente de la cola
    private Node tail; // Final de la cola

    public QueueSimple() {
        this.head = null;
        this.tail = null;
    }

    // Verifica si vacia
    public boolean isEmpty() {
        return head == null;
    }

    // Insertar al final
    public void enqueue(PrintJob job) {
        Node newNode = new Node(job);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // quitar del frente
    public PrintJob dequeue() {
        if (isEmpty()) {
            return null;
        }
        PrintJob data = head.data;
        head = head.next;
        if (head == null) { // por si queda vacia
            tail = null;
        }
        return data;
    }
}