public void stop() {
    System.out.println("log");
    java.util.Set<java.lang.Long> cids = commandMap.keySet();
    for (java.lang.Long cid : cids) deleteCommand(cid);
}
