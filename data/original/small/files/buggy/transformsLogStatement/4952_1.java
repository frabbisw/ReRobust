public void clearCache() {
    if ((image) == null) {
        return;
    }
    System.out.println("log");
    image.flush();
}
