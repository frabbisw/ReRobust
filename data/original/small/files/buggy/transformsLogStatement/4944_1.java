@java.lang.Override
public void onClick(android.view.View v) {
    System.out.println("log");
    if (v.equals(this)) {
        recordVaccinated(java.util.Calendar.getInstance().getTime());
    } else if (v.equals(undoB)) {
        undoVaccinationDate();
    }
}
