public static void listProcducts() {
    try {
        getController().listAllProducts();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
