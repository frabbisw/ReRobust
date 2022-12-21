public pl.mwezyk.parking.model.SingleCarStop stopParkingTimer(java.lang.String carPlateNumber, long id) {
    pl.mwezyk.parking.model.SingleCarStop singleCarStop = getSingleCarStop(carPlateNumber, id);
    try {
        singleCarStop.setEndDate(java.util.Calendar.getInstance().getTime());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    entityManager.merge(singleCarStop);
    return singleCarStop;
}
