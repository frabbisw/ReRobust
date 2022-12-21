private void QuestionsListValueChanged() {
    test.Main.index = QuestionsList.getSelectedIndex();
    try {
        loadQuest(test.Main.index);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
