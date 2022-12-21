private void changeText(java.lang.String string) {
    System.out.println("log");
    try {
        simonAlam.SimonScreenAlam.label.setText(string);
        java.lang.Thread.sleep(1000);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}
