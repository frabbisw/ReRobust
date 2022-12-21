public int showProgress(int percentage) {
    if ((percentage % 10) != 0) {
    }
    try {
        java.lang.System.out.println(percentage);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return percentage;
}
