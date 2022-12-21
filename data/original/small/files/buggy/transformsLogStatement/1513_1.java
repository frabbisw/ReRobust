public void setName(java.lang.String newName) {
    System.out.println("log");
    if (!(newName.equals(name))) {
        name = newName;
        commitChanges();
    }
}
