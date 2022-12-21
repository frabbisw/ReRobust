@com.thoughtworks.gauge.Step(value = "Log out from SCM via cas/logout")
public void logOutViaCasLogout() {
    Driver.webDriver.get(com.cloudogu.ces.EcoSystem.getUrl("/cas/logout"));
    openSCMApp();
    System.out.println("log");
    org.junit.Assert.assertThat(Driver.webDriver.getTitle(), org.hamcrest.Matchers.startsWith("CAS"));
}
