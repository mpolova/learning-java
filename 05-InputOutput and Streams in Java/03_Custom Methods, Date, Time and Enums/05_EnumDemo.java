/*
- enum — defines a fixed set of named constants (built-in, no import needed)
- enum as parameter type — restricts a method to only accept valid enum values
- EnumType.CONSTANT — how you reference a specific enum value
*/

public class 05_EnumDemo {
    // enum: defines a fixed set of named constants
    enum Direction {
        NORTH, EAST, SOUTH, WEST
    }

    // Direction parameter: method only accepts valid Direction values
    static void printDirection(Direction direction) {
        System.out.println("Direction: " + direction);
    }

    public static void main(String[] args) {
        // Direction.EAST: references a specific enum constant
        printDirection(Direction.EAST);
    }
}
