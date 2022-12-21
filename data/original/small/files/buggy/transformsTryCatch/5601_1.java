public java.lang.Boolean hasChanged() {
    try {
        if ((!(savedAnswers.equals(selectedAnswers))) && (!(savedAnswers.isEmpty()))) {
            return true;
        } else
            return false;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
