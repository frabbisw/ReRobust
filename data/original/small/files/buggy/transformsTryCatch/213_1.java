public void persist() throws java.lang.Exception {
    removeDeletedSections();
    removeTemplateSection();
    createSectionDefinitionsForNewSections();
    try {
        if (createNew) {
            duplicateExistingPlanTemplate();
        } else {
            org.xcolab.portlets.contestmanagement.wrappers.ContestProposalTemplateWrapper.deletePlanSectionDefinitionsOfProposalTemplateIfNotUsedInAnotherTemplate(planTemplate);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    addSectionsToProposalTemplate();
    updatePlanTemplateTitle();
}
