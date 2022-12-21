public boolean isSet(java.lang.String id) {
    if (0 > (currentLevel))
        return false;
    return levels.get(currentLevel).containsKey(id);
}
