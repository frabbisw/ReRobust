private void useAlleleQualityCBActionPerformed(java.awt.event.ActionEvent e) {
    try {
        updatedPreferenceMap.put(PreferenceManager.SAM_ALLELE_USE_QUALITY, java.lang.String.valueOf(useAlleleQualityCB.isSelected()));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.updateCoverageTrack = true;
}
