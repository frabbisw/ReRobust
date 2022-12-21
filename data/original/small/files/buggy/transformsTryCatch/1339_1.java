@gov.nih.nci.cabig.caaers.domain.report.Transient
public java.lang.Boolean isSponsorReport(java.lang.String nciInstituteCode) {
    try {
        if (reportDefinition.getOrganization().getNciInstituteCode().equals(nciInstituteCode))
            return true;
        else
            return false;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
