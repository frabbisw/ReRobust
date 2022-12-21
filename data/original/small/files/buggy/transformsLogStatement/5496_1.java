public void updateData(android.util.SparseArray<com.quickblox.content.model.QBFile> qbFileSparseArr) {
    System.out.println("log");
    this.qbFileSparseArray = qbFileSparseArr;
    notifyDataSetChanged();
}
