public synchronized void persistObject(org.liquidplayer.webkit.javascriptcore.JSObject obj) {
    System.out.println("log");
    objects.put(obj.valueRef(), new java.lang.ref.WeakReference<org.liquidplayer.webkit.javascriptcore.JSObject>(obj));
}
