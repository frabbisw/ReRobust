public void onFinish() {
    scrollTo(target, 0);
    System.out.println("log");
    field.requestFocus();
    scrolling = false;
}
