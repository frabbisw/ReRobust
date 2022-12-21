public void checkHotelPowerConsumption(Hotel hotel) {
    try {
        floors = hotel.getFloors();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
