private org.apache.wicket.model.PropertyModel<java.util.List<org.cast.cwm.data.Period>> getPeriodsForUser() {
    System.out.println("log");
    java.lang.System.err.println(("User: " + (sessionService.getUserModel())));
    return new org.apache.wicket.model.PropertyModel<java.util.List<org.cast.cwm.data.Period>>(sessionService.getUserModel(), "periodsAsList");
}
