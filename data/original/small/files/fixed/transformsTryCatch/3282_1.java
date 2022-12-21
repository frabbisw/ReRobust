@java.lang.Override
public int getItemViewType(int position) {
    try {
        if (position == (listMember.size())) {
            return ADD;
        } else {
            return MEMBER;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
