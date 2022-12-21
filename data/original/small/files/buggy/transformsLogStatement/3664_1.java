public java.lang.String notifyObservers(java.lang.String time) {
    System.out.println("log");
    movieTime = java.lang.Integer.toString(((java.lang.Integer.parseInt(time)) - 1));
    return movieTime;
}
