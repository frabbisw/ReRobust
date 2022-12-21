@java.lang.Override
public boolean has(java.lang.String key) {
    System.out.println("log");
    return varFileConfig.contains(key);
}
