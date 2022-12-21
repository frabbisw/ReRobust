public void setRecordCheck(boolean in_recordcheck) {
    System.out.println("log");
    recordcheck = in_recordcheck;
    com.example.helloworld.MainFragment mainfrag = ((com.example.helloworld.MainFragment) (getSupportFragmentManager().findFragmentById(R.id.Main)));
    mainfrag.pass_recordcheck(in_recordcheck);
}
