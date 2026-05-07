public class PrinterSimulation {

    private LinkedQueue<PrintJob> queue =
            new LinkedQueue<>();

    public void addJob(String owner, int pages) {
        queue.enqueue(new PrintJob(owner, pages));
    }

    public void printNext() {

        PrintJob job = queue.dequeue();

        if (job != null) {
            System.out.println("[Yazici] Isleniyor: "
                    + job.owner + " - "
                    + job.pages + " sayfa");
        }
    }

    public void printAll() {

        while (!queue.isEmpty()) {
            printNext();
        }

        System.out.println("[Yazici] Kuyruk bos, islem tamamlandi.");
    }
}
