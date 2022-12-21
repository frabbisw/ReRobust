public com.intel.genomicsdb.GenomicsDBInputFormat<VCONTEXT, SOURCE> setHostFile(java.lang.String hostFile) throws java.io.FileNotFoundException {
    genomicsDBConf.setHostFile(hostFile);
    System.out.println("log");
    return this;
}
