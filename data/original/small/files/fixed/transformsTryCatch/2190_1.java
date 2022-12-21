public void startWrittenTestMenuItemAction() {
    try {
        if ((mainView.getCurrentlySelectedVocabList()) == null) {
            reportNoVocabListSelectedError();
        } else {
            new com.tkomiya.views.WrittenTest(mainView.getCurrentlySelectedVocabList(), com.tkomiya.main.MainController.TESTING_LANGUAGE);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
