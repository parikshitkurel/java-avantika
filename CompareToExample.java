class CompareToExample {
    public static void main(String[] args) {
        String a = "apple";
        String b = "banana";

        // compareTo() returns:
        // negative → a < b
        // zero     → a == b
        // positive → a > b
        int result = a.compareTo(b);

        System.out.println("Result of a.compareTo(b): " + result);
    }
}
