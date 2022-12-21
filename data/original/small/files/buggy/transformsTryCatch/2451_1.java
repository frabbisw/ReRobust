@java.lang.Override
public void onClick(android.view.View view) {
    try {
        revealCorrectAnswer(1);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    updatePoints();
}
