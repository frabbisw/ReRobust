public void run() {
    System.out.println("log");
    try {
        writeFilesToZip();
    } catch (java.io.IOException ioe) {
        ioe.printStackTrace();
        net.sourceforge.processdash.util.FileUtils.safelyClose(this);
    }
}
