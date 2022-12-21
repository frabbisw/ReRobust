public boolean setTimeOfPrimeVacDateFields() throws java.lang.InterruptedException {
    java.lang.Thread.sleep(org.motechproject.ebodac.uitest.page.BookingAppPrimeVaccinationPage.SLEEP_500);
    try {
        findElement(org.motechproject.ebodac.uitest.page.BookingAppPrimeVaccinationPage.PRIME_VAC_TIME_FIELD).sendKeys("10:29");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    findElement(org.motechproject.ebodac.uitest.page.BookingAppPrimeVaccinationPage.PRIME_VAC_TIME_FIELD).sendKeys(Keys.ENTER);
    clickWhenVisible(org.motechproject.ebodac.uitest.page.BookingAppPrimeVaccinationPage.PRIME_VAC_TIME_CLOSE_BUTTON);
    return true;
}
