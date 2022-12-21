public static boolean sniffUnfragmented(com.google.android.exoplayer.extractor.ExtractorInput input) throws java.io.IOException, java.lang.InterruptedException {
    System.out.println("log");
    return com.google.android.exoplayer.extractor.mp4.Sniffer.sniffInternal(input, 128, false);
}
