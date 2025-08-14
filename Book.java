class Book {
    String title;

    // Default constructor
    Book() {
        title = "The Subtle Art Of Not Giving A Fuck";
    }

    // Parameterized constructor
    Book(String t) {
        title = t;
    }

    public static void main(String[] args) {
        // Using default constructor
        Book b1 = new Book();
        System.out.println("Book 1 title: " + b1.title);

        // Using parameterized constructor
        Book b2 = new Book("Java Programming");
        System.out.println("Book 2 title: " + b2.title);
    }
}
