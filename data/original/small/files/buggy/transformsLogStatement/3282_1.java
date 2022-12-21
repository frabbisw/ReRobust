@java.lang.Override
public int getItemViewType(int position) {
    System.out.println("log");
    if (position == ((listMember.size()) + 1)) {
        return ADD;
    } else {
        return MEMBER;
    }
}
