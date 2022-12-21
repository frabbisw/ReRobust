public void setFuel(java.lang.String fuel) throws com.cardealer.model.InvalidLenghtException {
    if ((com.cardealer.model.Car.MAX_LENGTH_10) <= (fuel.length())) {
        this.fuel = fuel;
    } else {
        throw new com.cardealer.model.InvalidLenghtException("fuel");
    }
}
