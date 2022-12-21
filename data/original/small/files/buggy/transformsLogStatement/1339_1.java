@gov.nih.nci.cabig.caaers.domain.report.Transient
public java.lang.Boolean isSponsorReport(java.lang.String nciInstituteCode) {
    System.out.println("log");
    if (reportDefinition.getOrganization().getNciInstituteCode().equals(nciInstituteCode))
        return true;
    else
        return false;
}
