public float sumConsumptionValue() {
    float sum = 0.0F;
    try {
        for (by.tarif.web.databuffer.Register register : list) {
            sum += register.getConsumption();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return sum;
}
