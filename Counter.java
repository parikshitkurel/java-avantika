class Counter {
    static int count = 0;

    Counter() {
        count++;
    }

    static void showCount() {
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        // Create objects
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        // Show total count using static method
        Counter.showCount();
    }
}
