@java.lang.Override
public void onClick(android.view.View v) {
    try {
        if (v.equals(undoB)) {
            undoVaccinationDate();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
