public void stop() {
    java.util.Set<java.lang.Long> cids = commandMap.keySet();
    try {
        for (java.lang.Long cid : cids) deleteCommand(cid);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
