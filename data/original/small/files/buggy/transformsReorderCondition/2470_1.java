private void runOnInputVcf(@org.jetbrains.annotations.NotNull final java.lang.String inputVcf, @org.jetbrains.annotations.NotNull final java.lang.String outputVcf) throws com.hartwig.hmftools.common.exception.HartwigException, java.io.IOException {
    com.hartwig.hmftools.consensusrule.ConsensusRuleFilterApplication.LOGGER.info((inputVcf + "Loading explicit vcf input from "));
    processVariants(com.hartwig.hmftools.common.variant.vcf.VCFFileLoader.loadSomaticVCF(inputVcf).variants(), outputVcf);
}
