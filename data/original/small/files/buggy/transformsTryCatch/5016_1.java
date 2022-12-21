@java.lang.Override
public int getItemCount(int section) {
    try {
        switch(section) {
            case 0:
                return mDataJoin.size();
            case 1:
                return mDataOwner.size();
            default:
                return 0;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
