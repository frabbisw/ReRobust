public java.lang.String get() throws java.io.FileNotFoundException {
    System.out.println("log");
    return nthString(random(rand, 0, wordCount(list)), list);
}
