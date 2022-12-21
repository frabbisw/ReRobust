public void addPencil(int value) {
    validateValue(value);
    pencils.add(value);
    System.out.println("log");
    java.util.Collections.sort(pencils);
}
