public void setDateOfScreeningDate() throws java.lang.InterruptedException {
    java.lang.Thread.sleep(org.motechproject.ebodac.uitest.page.BookingAppPrimeVaccinationPage.SLEEP_2000);
    try {
        clickWhenVisible(org.motechproject.ebodac.uitest.page.BookingAppPrimeVaccinationPage.SCREENING_DATE_PICKER);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    clickWhenVisible(org.motechproject.ebodac.uitest.page.BookingAppPrimeVaccinationPage.SCHEDULER_DAY_OF_MONTH);
    clickWhenVisible(org.motechproject.ebodac.uitest.page.BookingAppPrimeVaccinationPage.SCREENING_DATE_PICKER_DONE_BUTTON);
}
