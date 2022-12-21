public void doDelete() {
    setExternalScholarshipPhdGratuityContribuitionEvent(null);
    setParty(null);
    org.fenixedu.academic.domain.accounting.events.gratuity.GratuityContributionFile document = getDocument();
    try {
        setDocument(null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    document.delete();
    super.delete();
}
