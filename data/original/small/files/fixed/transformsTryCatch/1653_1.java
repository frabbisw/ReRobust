@java.lang.Override
public void show() {
    try {
        if ((peopleRecycleView) != null) {
            peopleRecycleView.update(wumf.com.sharedapps.firebase.observable.ObservablePeopleFirebase.getPeople());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
