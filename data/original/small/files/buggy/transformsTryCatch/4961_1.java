private org.apache.wicket.model.PropertyModel<java.util.List<org.cast.cwm.data.Period>> getPeriodsForUser() {
    try {
        java.lang.System.err.println(("User: " + (sessionService.getUserModel())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return new org.apache.wicket.model.PropertyModel<java.util.List<org.cast.cwm.data.Period>>(sessionService.getUserModel(), "periodsAsList");
}
