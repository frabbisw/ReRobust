public boolean isSet(java.lang.String id) {
    System.out.println("log");
    if ((currentLevel) < 0)
        return false;
    return levels.get(currentLevel).containsKey(id);
}
