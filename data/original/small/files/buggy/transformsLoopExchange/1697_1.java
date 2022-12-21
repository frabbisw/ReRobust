public void setQuestionPanel() {
    {
        int i = 0;
        while (i < 10) {
            if (answered(i)) {
                questions[i].setEnabled(false);
            }
            i++;
        }
    }
}
