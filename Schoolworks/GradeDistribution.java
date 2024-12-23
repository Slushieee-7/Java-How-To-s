public class GradeDistribution {
    private int numA;
    private int numB;
    private int numC;
    private int numD;
    private int numF;

    // Method to set the number of each letter grade
    public void setGrades(int a, int b, int c, int d, int f) {
        this.numA = a;
        this.numB = b;
        this.numC = c;
        this.numD = d;
        this.numF = f;
    }

    // Method to get the total number of grades
    public int getTotalGrades() {
        return numA + numB + numC + numD + numF;
    }

    // Method to calculate percentage of each letter grade
    public int getPercentage(int gradeCount) {
        int total = getTotalGrades();
        if (total == 0) return 0; // Avoid division by zero
        return (int) Math.round((gradeCount * 100.0) / total);
    }

    // Method to draw the graph
    public void drawGraph() {
        int totalGrades = getTotalGrades();
        int maxAsterisks = 50; // 50 asterisks correspond to 100%

        System.out.print("0 10 20 30 40 50 60 70 80 90 100\n");

        // Calculate percentages
        int percentA = getPercentage(numA);
        int percentB = getPercentage(numB);
        int percentC = getPercentage(numC);
        int percentD = getPercentage(numD);
        int percentF = getPercentage(numF);

        // Draw each row for A, B, C, D, F
        drawRow("A", percentA, maxAsterisks);
        drawRow("B", percentB, maxAsterisks);
        drawRow("C", percentC, maxAsterisks);
        drawRow("D", percentD, maxAsterisks);
        drawRow("F", percentF, maxAsterisks);

        System.out.println(totalGrades);
    }

    // Helper method to draw a single row in the graph
    private void drawRow(String grade, int percentage, int maxAsterisks) {
        int numAsterisks = (percentage * maxAsterisks) / 100;
        StringBuilder row = new StringBuilder();
        for (int i = 0; i < numAsterisks; i++) {
            row.append("*");
        }
        System.out.printf("%s %s%n", row.toString(), grade);
    }

    public static void main(String[] args) {
        GradeDistribution gd = new GradeDistribution();
        // Example data: 1 A, 4 B's, 6 C's, 2 D's, 1 F
        gd.setGrades(1, 4, 6, 2, 1);
        gd.drawGraph();
    }
}