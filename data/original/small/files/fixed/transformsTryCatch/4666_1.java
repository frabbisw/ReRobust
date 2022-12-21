private java.lang.Double getRatioScore(java.lang.Double jufuPercent, java.lang.Double hgaGameRatio) {
    try {
        lingda.service.GameRatioAnalyzer.logger.info("analyzer gives {}", (jufuPercent * (hgaGameRatio - 1)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return jufuPercent * (hgaGameRatio - 1);
}
