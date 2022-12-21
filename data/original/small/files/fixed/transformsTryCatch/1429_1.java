@java.lang.Override
public void onResume() {
    super.onResume();
    currentIndex = savedValues.getInt("index", 0);
    try {
        displayContent(currentIndex);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
