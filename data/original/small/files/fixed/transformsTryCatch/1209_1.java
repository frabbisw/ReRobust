public void setDateOfScreeningDate() throws java.lang.InterruptedException {
    clickWhenVisible(org.motechproject.ebodac.uitest.page.BookingAppPrimeVaccinationPage.SCREENING_DATE_PICKER);
    clickWhenVisible(org.motechproject.ebodac.uitest.page.BookingAppPrimeVaccinationPage.SCHEDULER_DAY_OF_MONTH);
    try {
        clickWhenVisible(org.motechproject.ebodac.uitest.page.BookingAppPrimeVaccinationPage.SCREENING_DATE_PICKER_DONE_BUTTON);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
