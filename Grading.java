class Grading{
    public static void main(String[] args) {
        int G1 = 95;
        int G2 = 85;
        int G3 = 97;

        double prelim = 0.3;
        double midterm = 0.3;
        double finals = 0.4;

        double prelim1 = (G1 * prelim) + (G2 * prelim) + (G3 * prelim);
        double midterm1 = (G1 * midterm) + (G2 * midterm) + (G3 * midterm);
        double final1 = (G1 * finals) + (G2 * finals) + (G3 * finals);

        System.out.println("Final grade: "+ ((G1 * prelim) + (G2 * midterm) + (G3 * finals)));
        System.out.println("Average grade: " + ((prelim1 + midterm1 + final1)/3));
}
}