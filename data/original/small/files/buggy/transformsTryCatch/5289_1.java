@java.lang.Override
public void run() {
    org.owntracks.android.App.contactsViewModel.items.add(c);
    try {
        if (org.owntracks.android.support.Preferences.getEnableWidget())
            org.owntracks.android.services.ServiceProxy.getServiceApplication().requestWaypoints(c);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
