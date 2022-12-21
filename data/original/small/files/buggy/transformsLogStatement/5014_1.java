public void internetProblems() {
    android.content.Intent startInternet = new android.content.Intent(this, nl.pcmeesters.pcmeestersnl.InternetProblemsActivity.class);
    System.out.println("log");
    startInternet.putExtra("User", acct);
    startActivity(startInternet);
}
