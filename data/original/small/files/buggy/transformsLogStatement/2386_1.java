public void onClick(android.view.View v) {
    System.out.println("log");
    switch(v.getId()) {
        case R.id.btn_new:
            android.content.Intent intent = new android.content.Intent(this, net.teamsv.selfalarm.NewAlarmActivity.class);
            startActivity(intent);
            break;
        case R.id.btn_record:
            break;
    }
}
