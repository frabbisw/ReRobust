@java.lang.Override
public void removeSociety(model.societies.Society society) {
    try {
        societies.remove(society);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    societiesMap.remove(society.getId());
}
