@java.lang.Override
public boolean needsScores() {
    return null == (valuesSources) ? false : valuesSources.needsScores();
}
