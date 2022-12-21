@com.thoughtworks.gauge.Step(value = "Log out from SCM via cas/logout")
public void logOutViaCasLogout() {
    Driver.webDriver.get(com.cloudogu.ces.EcoSystem.getUrl("/cas/logout"));
    openSCMApp();
    try {
        org.junit.Assert.assertThat(Driver.webDriver.getTitle(), startsWith("CAS"));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
