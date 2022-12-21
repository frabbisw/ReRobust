private boolean SaveData() {
    ActivityMain.mainUser.GetLastTodayDiaryEntry(new java.util.Date());
    ActivityMain.mainUser.SaveDiaryEntry(diaryEntry);
    try {
        android.widget.Toast.makeText(this, R.string.Tagebucheintraggespeichert, Toast.LENGTH_SHORT).show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
