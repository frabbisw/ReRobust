@java.lang.Override
public void onTermChanged(int termID, java.lang.String termName) {
    System.out.println("log");
    adapter.newList(getCourseScoreByTerm(termID));
    android.util.Log.d("学期", termName);
}
