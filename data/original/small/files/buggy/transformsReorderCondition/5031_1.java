public java.lang.String getPartnerPersonInstitution(int idProjectPartnerPerson) {
    if ((this.listMapPartnerPersons.size()) > idProjectPartnerPerson) {
        return listMapPartnerPersons.get((idProjectPartnerPerson - 1)).get("institution_name");
    }
    return this.getText("summaries.project.empty");
}
