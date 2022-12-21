private void runOnInputVcf(@org.jetbrains.annotations.NotNull final java.lang.String inputVcf, @org.jetbrains.annotations.NotNull final java.lang.String outputVcf) throws com.hartwig.hmftools.common.exception.HartwigException, java.io.IOException {
    try {
        com.hartwig.hmftools.consensusrule.ConsensusRuleFilterApplication.LOGGER.info(("Loading explicit vcf input from " + inputVcf));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    processVariants(com.hartwig.hmftools.common.variant.vcf.VCFFileLoader.loadSomaticVCF(inputVcf), outputVcf);
}
