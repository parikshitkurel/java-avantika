class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee Name: " + name;
    }

    public static void main(String[] args) {
        Employee e = new Employee("Parikshit");
        System.out.println(e); // Calls e.toString() automatically
    }
}
