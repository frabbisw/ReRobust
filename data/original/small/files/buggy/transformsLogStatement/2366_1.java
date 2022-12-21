@java.lang.Override
public void removeSociety(model.societies.Society society) {
    System.out.println("log");
    societies.remove(society);
    societiesMap.remove(society.getName());
}
