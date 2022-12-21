@java.lang.Override
public boolean needsScores() {
    System.out.println("log");
    return (valuesSources) == null ? false : valuesSources.needsScores();
}
