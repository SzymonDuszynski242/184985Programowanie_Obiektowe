package pakiet2;

import pakiet1.Person;

public class Employee extends Person {
    public void testAccess() {
        System.out.println(fieldProtected);
        System.out.println(fieldPublic);
    }
}


class HelperClass {
    public void testAccess(Person person) {
// System.out.println(person.fieldProtected);
    }
}