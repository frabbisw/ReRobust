public void addAppointment(com.zyumbik.makeanappointment.data_models.AppointmentData appointment) {
    try {
        dates.add(appointment.getTimeInMillis());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    addresses.add(appointment.getOffice().toString());
    removeOldAppointments();
}
