public class PrintManager {
    public static void main(String[] args) {
        // 1. Crear el servicio
        PrintService service = new PrintService();

        System.out.println("--- ENTRADA SIMULADA ---");
        System.out.println("Cargando trabajos al sistema...");

        // 2. Insertar trabajos (Ejemplo exacto del PDF)
        // Formato: Usuario, Páginas, Prioridad
        service.submitJob(new PrintJob("Juan", 5, 'M'));
        service.submitJob(new PrintJob("Ana", 2, 'H'));
        service.submitJob(new PrintJob("Luis", 10, 'L'));
        service.submitJob(new PrintJob("Carlos", 3, 'H'));
        service.submitJob(new PrintJob("Maria", 4, 'M'));

        System.out.println("Trabajos cargados exitosamente.");

        // 3. Procesar e imprimir resultados
        System.out.println("\n--- SALIDA ESPERADA (ORDEN DE IMPRESIÓN) ---");
        service.processAll();
    }
}