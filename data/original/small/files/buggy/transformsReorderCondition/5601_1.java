public java.lang.Boolean hasChanged() {
    if ((!(savedAnswers.isEmpty())) && (!(savedAnswers.equals(selectedAnswers)))) {
        return true;
    } else
        return false;
}
