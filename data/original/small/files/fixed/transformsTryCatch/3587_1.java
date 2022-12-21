@java.lang.Override
public void onTermChanged(int termID, java.lang.String termName) {
    try {
        adapter.newList(getCourseScoreByTerm(termID));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
