class Employee extends Person {
    private String position;

    public Employee(String firstName, String lastName, String position) {
        super(firstName, lastName);
        this.position = position;
    }

    public void displayData() {
        System.out.println(getFirstName());
        System.out.println(lastName);
        System.out.println(position);
    }
}