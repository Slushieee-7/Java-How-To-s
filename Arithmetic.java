public class Arithmetic {
        public int add(int a, int b) {
            return a + b;
        }
    
        public int add(int a, int b, int c) {
            return a + b + c;
        }

        public int add(int a, int b, int c, int d) {
            return a + b + c + d;
        }

        public int multiply(int a, int b) {
            return a * b;
        }

        public int multiply(int a, int b, int c) {
            return a * b * c;
        }
    
        public int subtract(int a, int b) {
            return a - b;
        }
    
        public double divide(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            return (double) a / b;
        }
    
        public static void main(String[] args) {
            Arithmetic arithmetic = new Arithmetic();

            System.out.println("add(1, 3): " + arithmetic.add(1, 3));
            System.out.println("add(1, 3, 4, 5): " + arithmetic.add(1, 3, 4, 5));
            System.out.println("multiply(2, 3, 4): " + arithmetic.multiply(2, 3, 4));
            System.out.println("multiply(1, 1): " + arithmetic.multiply(1, 1));
            System.out.println("subtract(3, 1): " + arithmetic.subtract(3, 1));
            System.out.println("divide(5, 2): " + arithmetic.divide(5, 2));
        }
    }

