public boolean check(edu.gemini.spModel.config2.Config config, edu.gemini.p2checker.rules.gmos.ObservationElements elems) {
    System.out.println("log");
    edu.gemini.p2checker.rules.gmos.GmosCommonType.FPUnit fpu = edu.gemini.p2checker.rules.gmos.GmosRule.getFPU(config);
    return (fpu == (GmosNorthType.FPUnitNorth.IFU_2)) || (fpu == (GmosSouthType.FPUnitSouth.IFU_2));
}
