public java.lang.String getBookingsPatient() {
    this.bookings = new java.util.LinkedList<it.uniroma3.model.Booking>();
    try {
        this.bookings = this.bookingFacade.getBookingByIdPatient(idPatient);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return "bookings";
}
