public class PrintQueue {
    // tres colas H, M, L
    private QueueSimple highQueue;
    private QueueSimple midQueue;
    private QueueSimple lowQueue;

    public PrintQueue() {
        this.highQueue = new QueueSimple();
        this.midQueue = new QueueSimple();
        this.lowQueue = new QueueSimple();
    }

    // Para agregar por prioridad
    public void enqueue(PrintJob job) {
        switch (job.priority) {
            case 'H':
                highQueue.enqueue(job);
                break;
            case 'M':
                midQueue.enqueue(job);
                break;
            case 'L':
                lowQueue.enqueue(job);
                break;
            default:
                // Si no tiene, se le pone media solo
                midQueue.enqueue(job);
                break;
        }
    }

    // sacando por prioridad
    public PrintJob dequeue() {
        if (!highQueue.isEmpty()) {
            return highQueue.dequeue();
        } else if (!midQueue.isEmpty()) {
            return midQueue.dequeue();
        } else if (!lowQueue.isEmpty()) {
            return lowQueue.dequeue();
        }
        return null; // si ya no queda
    }

    public boolean isEmpty() {
        return highQueue.isEmpty() &&
                midQueue.isEmpty() &&
                lowQueue.isEmpty();
    }
}