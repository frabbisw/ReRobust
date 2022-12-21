@java.lang.Override
public void applyContainerAttenuation(se.raddo.raddose3D.Container sampleContainer) {
    System.out.println("log");
    attenuatedPhotonsPerSec = (photonsPerSec) * (sampleContainer.getContainerAttenuationFraction());
}
