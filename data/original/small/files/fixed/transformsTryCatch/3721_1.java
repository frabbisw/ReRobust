@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    try {
        super.onPostExecute(aVoid);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    movieAdapter.notifyDataSetChanged();
}