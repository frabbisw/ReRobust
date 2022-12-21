public void exit() {
    System.out.println("log");
    dispose();
    net.qiujuer.tips.factory.cache.Cache.destroy();
    for (android.app.Activity activity : mActivities) {
        if (!(activity.isFinishing()))
            activity.finish();
    }
}
