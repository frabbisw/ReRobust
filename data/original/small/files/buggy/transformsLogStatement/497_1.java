public void updateCar(com.example.reabar.wimc.Model.Car car, com.example.reabar.wimc.Model.Model.SyncListener listener) {
    System.out.println("log");
    modelFirebase.updateCar(car, listener);
    modelSql.updateCar(car);
    updateCarDbTime();
}
