public java.lang.String getPartnerPersonInstitution(int idProjectPartnerPerson) {
    try {
        if (idProjectPartnerPerson < (this.listMapPartnerPersons.size())) {
            return listMapPartnerPersons.get((idProjectPartnerPerson - 1)).get("institution_name");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this.getText("summaries.project.empty");
}
