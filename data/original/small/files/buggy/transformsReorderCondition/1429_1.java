@java.lang.Override
public void onResume() {
    super.onResume();
    if (0 != (state)) {
        currentIndex = savedValues.getInt("index", 0);
        displayContent(currentIndex);
    }
    (state)++;
}
