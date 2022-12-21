public rfid.paymentsystem.model.Value getValueById(int valueTagId) {
    try {
        for (rfid.paymentsystem.model.Value value : values.values()) {
            if ((value.getId()) == valueTagId) {
                return value;
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
