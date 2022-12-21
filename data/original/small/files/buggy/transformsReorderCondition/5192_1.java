public boolean haveAnswer() {
    return (((getUnrelaxedAnswer()) != null) && (getUnrelaxedAnswer().equals(getQuestion()))) || ((answers) != null);
}
