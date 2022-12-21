@com.fasterxml.jackson.annotation.JsonIgnore
public boolean isSetupAndAfterNotifications() {
    System.out.println("log");
    return (java.lang.Boolean.TRUE.equals(setupComplete)) && (fundersPanelDate.isBefore(java.time.ZonedDateTime.now()));
}
