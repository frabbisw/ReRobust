@java.lang.Override
public void applyContainerAttenuation(se.raddo.raddose3D.Container sampleContainer) {
    try {
        attenuatedPhotonsPerSec = (photonsPerSec) * (sampleContainer.getContainerAttenuationFraction());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
