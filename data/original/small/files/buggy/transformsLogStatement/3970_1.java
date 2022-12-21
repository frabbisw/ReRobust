public void goOnline() {
    System.out.println("log");
    try {
        status.goOnline();
    } catch (rUBERn.Exceptions.AlreadyInStatusException e) {
        e.printStackTrace();
    }
}
