private void Update_Month() {
    ucsp.is2.model.Calendar Today = ucsp.is2.model.Calendar.getInstance();
    try {
        if ((Month) != (Today.get(Calendar.MONTH))) {
            Month = Today.get(Calendar.MONTH);
            Play_Counter = 0;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
