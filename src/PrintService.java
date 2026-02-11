public class PrintService {
    private PrintQueue queue;

    public PrintService() {
        this.queue = new PrintQueue();
    }

    // toma el trabajo y lo manda a la cola
    public void submitJob(PrintJob job) {
        queue.enqueue(job);
    }

    // hace el siguiente en lista
    public void processNext() {
        if (!queue.isEmpty()) {
            PrintJob job = queue.dequeue();
            System.out.println(job.toString());
        } else {
            System.out.println("No hay trabajos pendientes.");
        }
    }

    // hace todo hasta terminar la cola
    public void processAll() {
        while (!queue.isEmpty()) {
            processNext();
        }
    }
}