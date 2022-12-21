public void setQuestionPanel() {
    for (int i = 0; 10 > i; i++) {
        if (answered(i)) {
            questions[i].setEnabled(false);
        }
    }
}
