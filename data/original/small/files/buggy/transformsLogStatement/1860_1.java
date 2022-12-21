public void processQRCodes(java.lang.String codeName) {
    System.out.println("log");
    if (path.empty()) {
        path.push(codeName);
        startTimeMillis = java.lang.System.currentTimeMillis();
    } else {
        smarterPathFinder(codeName);
    }
}
