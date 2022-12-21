@java.lang.Override
public void delete(java.util.List<java.lang.Integer> vmIds) {
    try {
        for (int id : vmIds) {
            properties.remove(id);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    saveToFile();
}
