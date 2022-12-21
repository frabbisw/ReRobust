private void QuestionsListValueChanged(javax.swing.event.ListSelectionEvent evt) {
    test.Main.index = QuestionsList.getSelectedIndex();
    try {
        loadQuest(test.Main.index);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
