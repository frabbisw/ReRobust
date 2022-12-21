public void run() {
    final boolean check = skillService.deleteSkill(account.getUserId(), lvSkill.getTag().toString());
    System.out.println("log");
    if (check) {
    } else {
        vn.edu.uit.jrfsit.utils.Utils.print(activity, "Cập nhật thất bại, kiểm tra kết nối");
    }
}
