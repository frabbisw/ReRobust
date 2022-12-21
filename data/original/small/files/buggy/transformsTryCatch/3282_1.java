@java.lang.Override
public int getItemViewType(int position) {
    try {
        if (position == ((listMember.size()) + 1)) {
            return ADD;
        } else {
            return MEMBER;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
