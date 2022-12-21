public void updateReservedEvent() {
    System.out.println("log");
    ((main.ReservedEvent) (originalEvent)).setReservedTimes(((main.ReservedEvent) (selectedParameters)).getReservedTimes());
}
