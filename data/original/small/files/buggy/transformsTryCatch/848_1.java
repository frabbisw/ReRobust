public void setRecordCheck(boolean in_recordcheck) {
    recordcheck = in_recordcheck;
    com.example.helloworld.MainFragment mainfrag = ((com.example.helloworld.MainFragment) (getSupportFragmentManager().findFragmentById(R.id.Main)));
    try {
        mainfrag.pass_recordcheck(in_recordcheck);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
