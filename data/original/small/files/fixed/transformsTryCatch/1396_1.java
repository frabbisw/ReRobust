@java.lang.Override
public void run() {
    vn.edu.uit.jrfsit.utils.Utils.print(this, "Đã đặt lại mật khẩu, vui lòng kiểm tra mail của bạn");
    try {
        finish();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
