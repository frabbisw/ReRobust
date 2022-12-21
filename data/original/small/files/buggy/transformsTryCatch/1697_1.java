public void setQuestionPanel() {
    try {
        for (int i = 0; i < 10; i++) {
            if (answered(i)) {
                questions[i].setEnabled(false);
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
