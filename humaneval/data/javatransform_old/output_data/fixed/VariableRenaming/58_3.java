public static String[] numerical_letter_grade(double[] grades) {
    String[] letter_grade = new String[grades.length];
    for (int var = 0; var < grades.length; var += 1) {
        double gpa = grades[var];
        if (gpa == 4.0)
            letter_grade[var] = "A+";
        else if (gpa > 3.7)
            letter_grade[var] = "A";
        else if (gpa > 3.3)
            letter_grade[var] = "A-";
        else if (gpa > 3.0)
            letter_grade[var] = "B+";
        else if (gpa > 2.7)
            letter_grade[var] = "B";
        else if (gpa > 2.3)
            letter_grade[var] = "B-";
        else if (gpa > 2.0)
            letter_grade[var] = "C+";
        else if (gpa > 1.7)
            letter_grade[var] = "C";
        else if (gpa > 1.3)
            letter_grade[var] = "C-";
        else if (gpa > 1.0)
            letter_grade[var] = "D+";
        else if (gpa > 0.7)
            letter_grade[var] = "D";
        else if (gpa > 0.0)
            letter_grade[var] = "D-";
        else
            letter_grade[var] = "E";
    }
    return letter_grade;
}
