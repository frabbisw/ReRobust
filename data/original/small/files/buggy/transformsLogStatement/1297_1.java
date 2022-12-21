private void QuestionsListValueChanged(javax.swing.event.ListSelectionEvent evt) {
    System.out.println("log");
    test.Main.index = QuestionsList.getSelectedIndex();
    loadQuest(test.Main.index);
}
