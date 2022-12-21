public void updateReservedEvent() {
    try {
        ((main.ReservedEvent) (originalEvent)).setReservedTimes(((main.ReservedEvent) (originalEvent)).getReservedTimes());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
