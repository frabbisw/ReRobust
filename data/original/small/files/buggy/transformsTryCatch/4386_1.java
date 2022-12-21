public void run() {
    final boolean check = skillService.deleteSkill(account.getUserId(), lvSkill.getTag().toString());
    try {
        if (check) {
        } else {
            vn.edu.uit.jrfsit.utils.Utils.print(activity, "Cập nhật thất bại, kiểm tra kết nối");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
