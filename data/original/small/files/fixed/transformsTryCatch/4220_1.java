public float sumConsumptionValue() {
    float sum = 0.0F;
    try {
        for (by.tarif.web.databuffer.Register register : this.list) {
            sum += register.getConsumption();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return sum;
}
