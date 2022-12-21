public void addAppointment(com.zyumbik.makeanappointment.data_models.AppointmentData appointment) {
    dates.add(appointment.getTimeInMillis());
    try {
        addresses.add(appointment.getOffice().toString());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
