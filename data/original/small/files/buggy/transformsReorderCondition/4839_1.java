public boolean check(edu.gemini.spModel.config2.Config config, edu.gemini.p2checker.rules.gmos.ObservationElements elems) {
    edu.gemini.p2checker.rules.gmos.GmosCommonType.FPUnit fpu = edu.gemini.p2checker.rules.gmos.GmosRule.getFPU(config);
    return (fpu == (GmosSouthType.FPUnitSouth.IFU_2)) || (fpu == (GmosNorthType.FPUnitNorth.IFU_2));
}
