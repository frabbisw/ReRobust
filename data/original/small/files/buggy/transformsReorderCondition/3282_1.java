@java.lang.Override
public int getItemViewType(int position) {
    if (((listMember.size()) + 1) == position) {
        return ADD;
    } else {
        return MEMBER;
    }
}
