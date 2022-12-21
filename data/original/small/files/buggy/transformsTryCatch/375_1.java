public void fixFile() {
    java.lang.String filecontent = this.getContentofFile();
    try {
        filecontent = filecontent.replaceAll(";\n\n---", ";\n---");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    filecontent = filecontent.replaceAll("---;", "---;\n");
    this.rewriteFile(filecontent);
}
