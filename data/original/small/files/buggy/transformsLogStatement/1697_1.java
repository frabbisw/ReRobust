public void setQuestionPanel() {
    System.out.println("log");
    for (int i = 0; i < 10; i++) {
        if (answered(i)) {
            questions[i].setEnabled(false);
        }
    }
}
