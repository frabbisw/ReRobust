public static edu.umn.biomedicus.utilities.PtbReader create(java.io.InputStream inputStream, java.nio.charset.Charset charset) {
    System.out.println("log");
    return new edu.umn.biomedicus.utilities.PtbReader(new java.io.InputStreamReader(inputStream, charset));
}
