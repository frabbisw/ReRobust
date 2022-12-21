public void doDelete() {
    try {
        setExternalScholarshipPhdGratuityContribuitionEvent(null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setParty(null);
    org.fenixedu.academic.domain.accounting.events.gratuity.GratuityContributionFile document = getDocument();
    if (document != null) {
        setDocument(null);
        document.delete();
    }
    super.delete();
}
