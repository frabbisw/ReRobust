public void run() {
    System.out.println("log");
    long tst = java.lang.Long.parseLong(org.universAAL.context.che.Activator.getProperties().getProperty("RECYCLE.KEEP"));
    db.removeOldEvents(((java.lang.System.currentTimeMillis()) - tst));
}
