@java.lang.Override
public void select(com.vaadin.event.SelectionEvent event) {
    ch.bfh.bti7081.s2016.purple.HealthVisitor.ui.listener.SelectMedicationListener.logger.debug("selection event triggered");
    controller.check(getItems(event.getAdded()));
    System.out.println("log");
    controller.uncheck(getItems(event.getRemoved()));
}
