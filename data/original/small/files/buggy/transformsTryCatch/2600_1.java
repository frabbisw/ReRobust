public void setTotalPrice(no.europark.parkingBooking.entity.TimeSpan timeSpan, no.europark.parkingBooking.entity.ParkingPlace parkingPlace) {
    int totalPrice = no.europark.parkingBooking.Utility.CalculatePrice(timeSpan, parkingPlace);
    try {
        java.lang.System.out.println(("TOT.PRICE: " + totalPrice));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    addModelVariable("TotalPrice", totalPrice);
}
