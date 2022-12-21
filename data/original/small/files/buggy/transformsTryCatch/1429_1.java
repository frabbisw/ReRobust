@java.lang.Override
public void onResume() {
    super.onResume();
    try {
        if ((state) != 0) {
            currentIndex = savedValues.getInt("index", 0);
            displayContent(currentIndex);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    (state)++;
}
