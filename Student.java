class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

class Test {
    public static void main(String[] args) {
        // Creating an array that holds references to Student objects
        Student[] students = new Student[2];

        // Assigning objects to array elements
        students[0] = new Student("Alice");
        students[1] = new Student("Bob");

        // Printing the student names
        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}
