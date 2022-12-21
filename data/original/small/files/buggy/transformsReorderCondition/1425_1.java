@com.fasterxml.jackson.annotation.JsonIgnore
public boolean isSetupAndAfterNotifications() {
    return (fundersPanelDate.isBefore(java.time.ZonedDateTime.now())) && (java.lang.Boolean.TRUE.equals(setupComplete));
}
