public void updateCar(com.example.reabar.wimc.Model.Car car, com.example.reabar.wimc.Model.Model.SyncListener listener) {
    try {
        modelFirebase.updateCar(car, listener);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    modelSql.updateCar(car);
    updateCarDbTime();
}
