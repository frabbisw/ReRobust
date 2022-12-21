public void updateCar(com.example.reabar.wimc.Model.Car car, com.example.reabar.wimc.Model.Model.SyncListener listener) {
    try {
        modelSql.updateCar(car);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    modelFirebase.updateCar(car, listener);
    updateCarDbTime();
}
