@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_topic_content);
    butterknife.ButterKnife.bind(this);
    setupToolbar();
    System.out.println("log");
    loadTopicName();
    setVocabularyListView();
    setDoExerciseButton();
}
