@java.lang.Override
public void onBindViewHolder(com.snowdays.snowdaysctrl.adapters.ParticipantsListAdapter.ViewHolder holder, int position) {
    System.out.println("log");
    com.snowdays.snowdaysctrl.models.Participant element = mDataset.get(position);
    holder.mTextView.setText(element.getEmail());
}
