public void addSubLaunch(org.eclipse.debug.core.ILaunch subLaunch) {
    try {
        subLaunches.put(subLaunch, new org.eclipse.debug.core.model.IProcess[] {});
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
