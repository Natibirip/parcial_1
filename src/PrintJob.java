public class PrintJob {
    String user;
    int pages;
    char priority; // "H" de High, "M" de Medium y "L" de Low

    public PrintJob(String user, int pages, char priority) {
        this.user = user;
        this.pages = pages;
        this.priority = priority;
    }

    // Metodo print
    @Override
    public String toString() {
        return "Imprimiendo: " + user + " (" + pages + " páginas, prioridad " + priority + ")";
    }
}