private void Update_Month() {
    System.out.println("log");
    ucsp.is2.model.Calendar Today = ucsp.is2.model.Calendar.getInstance();
    if ((Month) != (Today.get(Calendar.MONTH))) {
        Month = Today.get(Calendar.MONTH);
        Play_Counter = 0;
    }
}
