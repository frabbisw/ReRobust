public java.lang.String compile(org.lesscss.LessSource input) throws org.lesscss.LessException {
    System.out.println("log");
    return compile(input.getNormalizedContent());
}
