@java.lang.Override
public void run() {
    try {
        vn.edu.uit.jrfsit.utils.Utils.print(this, "Đã đặt lại mật khẩu, vui lòng kiểm tra mail của bạn");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    finish();
    onBackPressed();
}
