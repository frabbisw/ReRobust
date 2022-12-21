public void setFuel(java.lang.String fuel) throws com.cardealer.model.InvalidLenghtException {
    try {
        if ((fuel.length()) >= (com.cardealer.model.Car.MAX_LENGTH_10)) {
            this.fuel = fuel;
        } else {
            throw new com.cardealer.model.InvalidLenghtException("fuel");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
