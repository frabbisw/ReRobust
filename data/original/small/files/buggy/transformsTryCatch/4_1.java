@butterknife.OnClick(value = R.id.break_time_ok)
public void onOkClicked() {
    for (scs71.com.scscws.data.db.BreakTime breakTime : times) breakTime.save();
    try {
        hide();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((callback) != null)
        callback.onOkClicked();
}
