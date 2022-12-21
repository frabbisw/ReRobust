public java.lang.Boolean hasChanged() {
    System.out.println("log");
    if ((!(savedAnswers.equals(selectedAnswers))) && (!(savedAnswers.isEmpty()))) {
        return true;
    } else
        return false;
}
