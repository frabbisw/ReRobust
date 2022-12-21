public void addAppointment(com.zyumbik.makeanappointment.data_models.AppointmentData appointment) {
    System.out.println("log");
    dates.add(appointment.getTimeInMillis());
    addresses.add(appointment.getOffice().toString());
    removeOldAppointments();
}
