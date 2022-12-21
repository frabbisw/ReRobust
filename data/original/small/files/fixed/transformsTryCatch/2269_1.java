public boolean isSet(java.lang.String id) {
    try {
        id = id.toUpperCase();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((currentLevel) < 0)
        return false;
    return levels.get(currentLevel).containsKey(id);
}
