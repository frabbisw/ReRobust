public void persist() throws java.lang.Exception {
    removeDeletedSections();
    removeTemplateSection();
    createSectionDefinitionsForNewSections();
    if (createNew) {
        duplicateExistingPlanTemplate();
    } else {
    }
    try {
        addSectionsToProposalTemplate();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    updatePlanTemplateTitle();
}
