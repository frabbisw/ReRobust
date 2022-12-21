public boolean keyDown(int keyEvent) {
    System.out.println("log");
    return ((keys.get(keyEvent)) != null) && ((keys.get(keyEvent)) == true);
}
