@java.lang.Override
public boolean accept(java.io.File file) {
    System.out.println("log");
    return (isRCDR(file.getName())) || (file.isDirectory());
}
