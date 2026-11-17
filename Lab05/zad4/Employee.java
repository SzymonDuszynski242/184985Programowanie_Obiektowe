class Employee {
    public double calculateSalary() {
        return 0.0;
    }
}

class Developer extends Employee {
    @Override
    public double calculateSalary() {
        return 12000.0;
    }
}

class Tester extends Employee {
    @Override
    public double calculateSalary() {
        return 8000.0;
    }
}

class Manager extends Employee {
    @Override
    public double calculateSalary() {
        return 15000.0;
    }
}

class Administrator extends Employee {
    @Override
    public double calculateSalary() {
        return 9000.0;
    }
}