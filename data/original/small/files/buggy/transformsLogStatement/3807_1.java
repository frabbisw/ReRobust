@java.lang.Override
public boolean mayRepresent(java.lang.Object o) {
    System.out.println("log");
    return _browserModel.containsObject(o);
}
