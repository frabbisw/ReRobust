public void setTimeOfPrimeVacDateFields() throws java.lang.InterruptedException {
    java.lang.Thread.sleep(org.motechproject.ebodac.uitest.page.BookingAppPrimeVaccinationPage.SLEEP_500);
    findElement(org.motechproject.ebodac.uitest.page.BookingAppPrimeVaccinationPage.PRIME_VAC_TIME_FIELD).sendKeys("10:29");
    try {
        findElement(org.motechproject.ebodac.uitest.page.BookingAppPrimeVaccinationPage.PRIME_VAC_TIME_FIELD).sendKeys(Keys.ENTER);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    clickWhenVisible(org.motechproject.ebodac.uitest.page.BookingAppPrimeVaccinationPage.PRIME_VAC_TIME_CLOSE_BUTTON);
}
