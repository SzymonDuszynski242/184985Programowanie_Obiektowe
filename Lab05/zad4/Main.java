public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Developer(),
                new Tester(),
                new Manager(),
                new Administrator()
        };

        for (Employee employee : employees) {
            System.out.println(employee.calculateSalary());
        }
    }
}