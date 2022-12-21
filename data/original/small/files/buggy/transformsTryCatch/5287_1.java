private java.lang.String getQuestionHTML(Question q, int question, int student) {
    try {
        if (q instanceof MultipleChoiceQuestion)
            return getMultipleChoiceQuestionHTML(((MultipleChoiceQuestion) (q)), question, student);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return "";
}
