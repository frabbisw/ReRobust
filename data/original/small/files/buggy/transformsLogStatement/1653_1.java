@java.lang.Override
public void show() {
    System.out.println("log");
    peopleRecycleView.update(wumf.com.sharedapps.firebase.observable.ObservablePeopleFirebase.getPeople());
}
