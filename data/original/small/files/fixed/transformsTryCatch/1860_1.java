public void processQRCodes(java.lang.String codeName) {
    try {
        if ((path.size()) < 1) {
            path.push(codeName);
            startTimeMillis = java.lang.System.currentTimeMillis();
        } else {
            smarterPathFinder(codeName);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
