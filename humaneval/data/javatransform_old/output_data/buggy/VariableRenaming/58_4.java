public static String[] numerical_letter_grade(double[] grades) {
    String[] letter_grade = new String[grades.length];
    for (int i = 0; i < grades.length; i += 1) {
        double var = grades[i];
        if (var == 4.0)
            letter_grade[i] = "A+";
        else if (var > 3.7)
            letter_grade[i] = "A";
        else if (var > 3.3)
            letter_grade[i] = "A-";
        else if (var > 3.0)
            letter_grade[i] = "B+";
        else if (var > 2.7)
            letter_grade[i] = "B";
        else if (var > 2.3)
            letter_grade[i] = "B-";
        else if (var > 2.0)
            letter_grade[i] = "C+";
        else if (var > 1.3)
            letter_grade[i] = "C-";
        else if (var > 1.0)
            letter_grade[i] = "D+";
        else if (var > 1.7)
            letter_grade[i] = "C";
        else if (var > 0.7)
            letter_grade[i] = "D";
        else if (var > 0.0)
            letter_grade[i] = "D-";
        else
            letter_grade[i] = "E";
    }
    return letter_grade;
}
