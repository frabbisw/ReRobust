public void run() {
    long tst = java.lang.Long.parseLong(org.universAAL.context.che.Activator.getProperties().getProperty("RECYCLE.KEEP"));
    try {
        db.removeOldEvents(((java.lang.System.currentTimeMillis()) - tst));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
