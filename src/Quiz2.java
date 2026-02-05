public class Quiz2 {

    // Question 1
    public void executeGradeReport(double score) {
        // Call validateScore. If false, print "Invalid Score" and stop
        if (!validateScore(score)) {
            System.out.println("Invalid Score");
            return;
        }

        // If valid, call calculateLetterGrade and store in a variable
        char grade = calculateLetterGrade(score);

        // Pass that grade into displayPerformanceMessage to print feedback
        displayPerformanceMessage(grade);
    }

    // Supporting methods for Question 1
    public boolean validateScore(double score) {
        return score >= 0 && score <= 100;
    }

    public char calculateLetterGrade(double score) {
        if (score >= 80) return 'A';
        if (score >= 70) return 'B';
        if (score >= 60) return 'C';
        if (score >= 50) return 'D';
        return 'F';
    }

    public void displayPerformanceMessage(char grade) {
        System.out.println("Final Grade: " + grade);
    }

    // start of question 2
    public double calculateClassAverage(double score1, double score2) {
        return (score1 + score2) / 2.0;
    }

    public double calculateClassAverage(double score1, double score2, double score3) {
        return (score1 + score2 + score3) / 3.0;
    }

    public double calculateClassAverage(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    } // end of question 2
}