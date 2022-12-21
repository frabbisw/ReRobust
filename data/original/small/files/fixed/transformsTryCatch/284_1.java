public void exit() {
    net.qiujuer.tips.factory.cache.Cache.destroy();
    try {
        for (android.app.Activity activity : mActivities) {
            if (!(activity.isFinishing()))
                activity.finish();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
