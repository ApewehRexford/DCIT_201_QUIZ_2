public class Main {
    public static void main(String[] args) {
        // Instantiate the Quiz1 class
        Quiz2 myQuiz = new Quiz2();

        // Run the Grade Report Testing executeGradeReport
        myQuiz.executeGradeReport(85.5);

        // Testing calculateClassAverage
        double avg = myQuiz.calculateClassAverage(70, 90);
        System.out.println("Class Average: " + avg);
    }
}