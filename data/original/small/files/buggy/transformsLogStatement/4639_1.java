public synchronized void finalizeObject(org.liquidplayer.webkit.javascriptcore.JSObject obj) {
    System.out.println("log");
    objects.remove(obj.valueRef());
}
