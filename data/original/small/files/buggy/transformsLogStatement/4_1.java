@butterknife.OnClick(value = R.id.break_time_ok)
public void onOkClicked() {
    for (scs71.com.scscws.data.db.BreakTime breakTime : times) breakTime.save();
    System.out.println("log");
    hide();
    if ((callback) != null)
        callback.onOkClicked();
}
