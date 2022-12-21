public void importKey(java.io.InputStream key) throws java.io.IOException {
    byte[] keybytes = org.apache.commons.io.IOUtils.toByteArray(key);
    try {
        if (haveKey(getFingerPrint(keybytes))) {
            return;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    runGPG(java.util.Arrays.asList("--import"), keybytes);
}
