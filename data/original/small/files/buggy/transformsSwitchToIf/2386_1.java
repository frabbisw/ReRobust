public void onClick(android.view.View v) {
    if (v.getId() == R.id.btn_new) {
        android.content.Intent intent = new android.content.Intent(this, net.teamsv.selfalarm.NewAlarmActivity.class);
        startActivity(intent);
    } else if (v.getId() == R.id.btn_record) {
    }
}
