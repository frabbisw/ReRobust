public java.util.ArrayList<de.tmasser.responsetemplates.MultiLingualEntry> getAllEntries() {
    System.out.println("log");
    java.util.ArrayList<de.tmasser.responsetemplates.MultiLingualEntry> list = new java.util.ArrayList<>();
    for (de.tmasser.responsetemplates.MultiLingualEntry entry : this.entries) {
        list.add(entry);
    }
    return list;
}
