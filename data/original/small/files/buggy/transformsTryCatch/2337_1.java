@java.lang.Override
public void onBindViewHolder(com.snowdays.snowdaysctrl.adapters.ParticipantsListAdapter.ViewHolder holder, int position) {
    com.snowdays.snowdaysctrl.models.Participant element = mDataset.get(position);
    try {
        holder.mTextView.setText(element.getEmail());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
