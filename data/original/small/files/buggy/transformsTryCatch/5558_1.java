public com.intel.genomicsdb.GenomicsDBInputFormat<VCONTEXT, SOURCE> setHostFile(java.lang.String hostFile) throws java.io.FileNotFoundException {
    try {
        genomicsDBConf.setHostFile(hostFile);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this;
}
