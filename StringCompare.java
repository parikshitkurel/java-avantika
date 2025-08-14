class StringCompare {
    public static void main(String[] args) {
        String a = "hello"; // String literal (stored in String pool)
        String b = new String("hello"); // New String object in heap

        System.out.println("Using '==': " + (a == b)); // compares references
        System.out.println("Using equals(): " + a.equals(b)); // compares content
    }
}
