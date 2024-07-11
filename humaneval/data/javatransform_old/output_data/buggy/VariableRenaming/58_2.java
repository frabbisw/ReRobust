public static String[] numerical_letter_grade(double[] grades) {
    String[] var = new String[grades.length];
    for (int i = 0; i < grades.length; i += 1) {
        double gpa = grades[i];
        if (gpa == 4.0)
            var[i] = "A+";
        else if (gpa > 3.7)
            var[i] = "A";
        else if (gpa > 3.3)
            var[i] = "A-";
        else if (gpa > 3.0)
            var[i] = "B+";
        else if (gpa > 2.7)
            var[i] = "B";
        else if (gpa > 2.3)
            var[i] = "B-";
        else if (gpa > 2.0)
            var[i] = "C+";
        else if (gpa > 1.3)
            var[i] = "C-";
        else if (gpa > 1.0)
            var[i] = "D+";
        else if (gpa > 1.7)
            var[i] = "C";
        else if (gpa > 0.7)
            var[i] = "D";
        else if (gpa > 0.0)
            var[i] = "D-";
        else
            var[i] = "E";
    }
    return var;
}
