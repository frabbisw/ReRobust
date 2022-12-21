@javax.persistence.Transient
public java.lang.Boolean isSponsorReport(java.lang.String nciInstituteCode) {
    try {
        if (reportDefinition.getOrganization().getNciInstituteCode().equals(nciInstituteCode))
            return true;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
