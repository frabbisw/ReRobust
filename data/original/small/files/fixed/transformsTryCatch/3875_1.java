public void displaySchedule(comp110.Schedule schedule) {
    _scheduleStage = new javafx.stage.Stage();
    renderScheduleStage(schedule);
    try {
        _scheduleStage.show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
