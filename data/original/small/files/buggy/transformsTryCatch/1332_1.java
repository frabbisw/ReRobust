public void updateReservedEvent() {
    try {
        ((main.ReservedEvent) (originalEvent)).setReservedTimes(((main.ReservedEvent) (selectedParameters)).getReservedTimes());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
