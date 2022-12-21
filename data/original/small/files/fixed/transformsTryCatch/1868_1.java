@java.lang.Override
public double[] getBlackPoint() {
    try {
        if ((colorSpace) instanceof org.verapdf.features.pb.objects.PDCIEDictionaryBasedColorSpace) {
            org.verapdf.features.pb.objects.PDCIEDictionaryBasedColorSpace cie = ((org.verapdf.features.pb.objects.PDCIEDictionaryBasedColorSpace) (colorSpace));
            return org.verapdf.features.pb.objects.PBColorSpaceFeaturesObjectAdapter.parseTristimulus(cie.getBlackPoint());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
