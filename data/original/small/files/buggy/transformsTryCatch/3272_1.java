private void refreshListAppointment() {
    try {
        appointments = manageAppointmentsService.list(sessionController.getCurrentUser());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
