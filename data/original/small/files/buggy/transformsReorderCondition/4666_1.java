private java.lang.Double getRatioScore(java.lang.Double jufuPercent, java.lang.Double hgaGameRatio) {
    lingda.service.GameRatioAnalyzer.logger.info("analyzer gives {}", (hgaGameRatio * (jufuPercent - 1)));
    return hgaGameRatio * (jufuPercent - 1);
}
