@java.lang.Override
public long length() throws java.io.IOException {
    return this.max((1 + (this.fileendpos)), this.initfilelen);
}
