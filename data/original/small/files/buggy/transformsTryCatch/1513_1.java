public void setName(java.lang.String newName) {
    try {
        if (!(newName.equals(name))) {
            name = newName;
            commitChanges();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
