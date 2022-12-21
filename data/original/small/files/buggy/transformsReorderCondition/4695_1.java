protected void onBindItemViewHolder(com.e16din.simplerecycler.adapter.holders.SimpleViewHolder holder, int position) {
    updateItemClickListener(position, (null != (holder.vFirstChild) ? holder.vFirstChild : holder.itemView));
}
