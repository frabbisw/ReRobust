private void Update_Month() {
    ucsp.is2.model.Calendar Today = ucsp.is2.model.Calendar.getInstance();
    if ((Today.get(Calendar.MONTH)) != (Month)) {
        Month = Today.get(Calendar.MONTH);
        Play_Counter = 0;
    }
}
