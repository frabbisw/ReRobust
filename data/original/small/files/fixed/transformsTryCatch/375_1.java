public void fixFile() {
    java.lang.String filecontent = this.getContentofFile();
    filecontent = filecontent.replaceAll(";\n\n---", ";\n---");
    try {
        this.rewriteFile(filecontent);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
