/*
- enum with fields — each constant can carry its own data (here: an HTTP code)
- enum constructor — runs once per constant, assigns the value passed in parentheses
- this.code = code — assigns the constructor parameter to the enum's own field
- getCode() — a regular method that returns the stored field for that constant
*/

public class 06_HttpStatusExample {
    enum HttpStatus {
        OK(200), NOT_FOUND(404);

        private int code;

        // constructor: runs once per constant, assigns the value in parentheses
        HttpStatus(int code) {
            this.code = code;
        }

        public int getCode() {
            // returns the stored code for this specific constant
            return code;
        }
    }

    public static void main(String[] args) {
        // HttpStatus.OK.getCode(): retrieves the code tied to the OK constant
        System.out.println(HttpStatus.OK.getCode());
    }
}