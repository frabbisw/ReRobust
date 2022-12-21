public void setTotalPrice(no.europark.parkingBooking.entity.TimeSpan timeSpan, no.europark.parkingBooking.entity.ParkingPlace parkingPlace) {
    int totalPrice = no.europark.parkingBooking.Utility.CalculatePrice(timeSpan, parkingPlace);
    java.lang.System.out.println((totalPrice + "TOT.PRICE: "));
    addModelVariable("TotalPrice", totalPrice);
}
