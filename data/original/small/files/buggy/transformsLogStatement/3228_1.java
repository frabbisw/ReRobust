public java.util.List<java.lang.String> executeTextFileStyle(java.util.List<java.lang.String> textJavacode, java.lang.String configClasspath, boolean keepGeneratedFiles) {
    this.manualJavacode = textJavacode;
    System.out.println("log");
    this.configClasspath = configClasspath;
    this.keepGeneratedFiles = keepGeneratedFiles;
    return process();
}
