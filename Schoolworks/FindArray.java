class FindArray {
    private Object[] array;

    public FindArray(Object[] array) {
        this.array = array;
    }

    public void displayContents() {
        try {
            for (int i = 0; i <= array.length; i++) { // Intentional off-by-one for demonstration
                System.out.println("Index " + i + ": " + array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Object[] validArray = {1, 2, 3, 4, 5};
        FindArray finder1 = new FindArray(validArray);
        finder1.displayContents();

        FindArray finder2 = new FindArray(null);
        finder2.displayContents();

        Object[] errorArray = {1, 2, 3};
        FindArray finder3 = new FindArray(errorArray);
        finder3.displayContents();
    }
}