@java.lang.Override
public double[] getBlackPoint() {
    System.out.println("log");
    if ((colorSpace) instanceof org.verapdf.features.pb.objects.PDCIEDictionaryBasedColorSpace) {
        org.verapdf.features.pb.objects.PDCIEDictionaryBasedColorSpace cie = ((org.verapdf.features.pb.objects.PDCIEDictionaryBasedColorSpace) (colorSpace));
        org.verapdf.features.pb.objects.PBColorSpaceFeaturesObjectAdapter.parseTristimulus(cie.getBlackPoint());
    }
    return null;
}
