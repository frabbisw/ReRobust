public void done(com.parse.ParseException e) {
    if (null != e) {
        android.content.Intent mapIntent = new android.content.Intent();
        mapIntent.setClass(getApplicationContext(), com.example.cmput401.classdiscuss.MapActivity.class);
        startActivity(mapIntent);
    } else {
    }
}
