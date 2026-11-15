class QueueQ4 {
    public static void main(String args[]) {
        // Start: Empty
        // Enqueue(10) -> [10]
        // Enqueue(20) -> [10, 20]
        // Enqueue(30) -> [10, 20, 30]
        // Dequeue() -> 10 removed -> [20, 30]
        // Enqueue(40) -> [20, 30, 40]
        // Dequeue() -> 20 removed -> [30, 40]
        System.out.println("Final Queue: [30, 40]");
        System.out.println("Front Element: 30");
    }
}
