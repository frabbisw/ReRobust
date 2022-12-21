@java.lang.Override
public void onBindViewHolder(com.madun.yeehaw.adapter.viewHolder.ComHolder holder, int position) {
    try {
        mLayoutId = getViewHolderLayoutId(position);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    conver(holder, mData.get(position), mLayoutId);
}
