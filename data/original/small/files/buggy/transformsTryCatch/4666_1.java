private java.lang.Double getRatioScore(java.lang.Double jufuPercent, java.lang.Double hgaGameRatio) {
    try {
        lingda.service.GameRatioAnalyzer.logger.info("analyzer gives {}", ((jufuPercent - 1) * hgaGameRatio));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return (jufuPercent - 1) * hgaGameRatio;
}
