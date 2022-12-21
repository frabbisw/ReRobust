@java.lang.Override
public void onClick(android.view.View view) {
    try {
        revealCorrectAnswer(0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    updatePoints();
}
