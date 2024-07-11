public static String[] numerical_letter_grade(double[] var) {
    String[] letter_grade = new String[var.length];
    for (int i = 0; i < var.length; i += 1) {
        double gpa = var[i];
        if (gpa == 4.0)
            letter_grade[i] = "A+";
        else if (gpa > 3.7)
            letter_grade[i] = "A";
        else if (gpa > 3.3)
            letter_grade[i] = "A-";
        else if (gpa > 3.0)
            letter_grade[i] = "B+";
        else if (gpa > 2.7)
            letter_grade[i] = "B";
        else if (gpa > 2.3)
            letter_grade[i] = "B-";
        else if (gpa > 2.0)
            letter_grade[i] = "C+";
        else if (gpa > 1.3)
            letter_grade[i] = "C-";
        else if (gpa > 1.0)
            letter_grade[i] = "D+";
        else if (gpa > 1.7)
            letter_grade[i] = "C";
        else if (gpa > 0.7)
            letter_grade[i] = "D";
        else if (gpa > 0.0)
            letter_grade[i] = "D-";
        else
            letter_grade[i] = "E";
    }
    return letter_grade;
}
