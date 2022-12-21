public void exit() {
    dispose();
    try {
        net.qiujuer.tips.factory.cache.Cache.destroy();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    for (android.app.Activity activity : mActivities) {
        if (!(activity.isFinishing()))
            activity.finish();
    }
}
