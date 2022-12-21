public boolean haveAnswer() {
    System.out.println("log");
    return ((answers) != null) || (((getUnrelaxedAnswer()) != null) && (getUnrelaxedAnswer().equals(getQuestion())));
}
