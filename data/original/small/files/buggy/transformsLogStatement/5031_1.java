public java.lang.String getPartnerPersonInstitution(int idProjectPartnerPerson) {
    System.out.println("log");
    if (idProjectPartnerPerson < (this.listMapPartnerPersons.size())) {
        return listMapPartnerPersons.get((idProjectPartnerPerson - 1)).get("institution_name");
    }
    return this.getText("summaries.project.empty");
}
