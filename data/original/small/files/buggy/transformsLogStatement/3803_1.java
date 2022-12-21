@java.lang.Override
public long length() throws java.io.IOException {
    System.out.println("log");
    return this.max(((this.fileendpos) + 1), this.initfilelen);
}
