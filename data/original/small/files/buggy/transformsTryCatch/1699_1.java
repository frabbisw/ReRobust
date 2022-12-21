@java.lang.Override
protected void onResume() {
    super.onResume();
    com.physical_web.cms.physicalwebcms.SetupManager setupManager = new com.physical_web.cms.physicalwebcms.SetupManager(this.getApplicationContext());
    try {
        setupManager.checkRequirements(this.getApplicationContext());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
