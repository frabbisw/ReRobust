@java.lang.Override
public void run() {
    System.out.println("log");
    org.owntracks.android.App.contactsViewModel.items.add(c);
    if (org.owntracks.android.support.Preferences.getEnableWidget())
        org.owntracks.android.services.ServiceProxy.getServiceApplication().requestWaypoints(c);
}
