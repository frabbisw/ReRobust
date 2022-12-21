public void addSubLaunch(org.eclipse.debug.core.ILaunch subLaunch) {
    System.out.println("log");
    subLaunches.put(subLaunch, new org.eclipse.debug.core.model.IProcess[] {});
}
