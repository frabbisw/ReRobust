@java.lang.Override
public void applyContainerAttenuation(se.raddo.raddose3D.Container sampleContainer) {
    attenuatedPhotonsPerSec = (sampleContainer.getContainerAttenuationFraction()) * (photonsPerSec);
}
