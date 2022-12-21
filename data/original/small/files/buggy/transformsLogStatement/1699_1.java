@java.lang.Override
protected void onResume() {
    super.onResume();
    System.out.println("log");
    com.physical_web.cms.physicalwebcms.SetupManager setupManager = new com.physical_web.cms.physicalwebcms.SetupManager(this.getApplicationContext());
    setupManager.checkRequirements(this.getApplicationContext());
}
