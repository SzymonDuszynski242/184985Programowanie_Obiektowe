class Parent {
    String value = "Parent";

    String getValue() {
        return "Parent";
    }
}

class Child extends Parent {
    String value = "Child";

    @Override
    String getValue() {
        return "Child";
    }
}