/*
- extends: inherits fields/methods from a parent class
- @Override: marks a method as replacing the parent's version (compiler checks it matches)
- method overriding: subclass gives its own implementation of an inherited method
*/

// extends: Phone inherits from Device
class Phone extends Device {
    // @Override: replaces Device's turnOn() with this version
    @Override
    void turnOn() {
        System.out.println("Phone is turning on");
    }

    public static void main(String[] args) {
        Phone p = new Phone();
        // calls Phone's overridden turnOn(), not Device's
        p.turnOn();
    }
}

class Device {
    void turnOn() {
        System.out.println("Device is turning on");
    }
}