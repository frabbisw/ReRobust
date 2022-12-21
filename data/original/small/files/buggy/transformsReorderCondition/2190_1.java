private void startWrittenTestMenuItemAction() {
    if (null == (mainView.getCurrentlySelectedVocabList())) {
        reportNoVocabListSelectedError();
    } else {
        new com.tkomiya.views.WrittenTest(mainView.getCurrentlySelectedVocabList(), com.tkomiya.main.MainController.TESTING_LANGUAGE);
    }
}
