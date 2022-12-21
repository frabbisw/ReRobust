public void stop() throws java.lang.Exception {
    try {
        for (java.lang.Long cid : commandMap.keySet()) deleteCommand(cid);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
