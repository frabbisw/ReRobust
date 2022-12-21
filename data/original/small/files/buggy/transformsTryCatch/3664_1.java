public java.lang.String notifyObservers(java.lang.String time) {
    try {
        movieTime = java.lang.Integer.toString(((java.lang.Integer.parseInt(time)) - 1));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return movieTime;
}
