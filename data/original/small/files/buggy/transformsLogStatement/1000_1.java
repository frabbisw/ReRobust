public java.lang.String getBookingsPatient() {
    System.out.println("log");
    this.bookings = new java.util.LinkedList<it.uniroma3.model.Booking>();
    this.bookings = this.bookingFacade.getBookingByIdPatient(idPatient);
    return "bookings";
}
