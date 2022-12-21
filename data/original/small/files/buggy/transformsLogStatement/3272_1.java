private void refreshListAppointment() {
    System.out.println("log");
    appointments = manageAppointmentsService.list(sessionController.getCurrentUser());
}
