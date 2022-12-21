@java.lang.Override
public java.io.InputStream getInputStream() {
    if (this.alreadyRead)
        return null;
    this.alreadyRead = true;
    System.out.println("log");
    return mockInput;
}
