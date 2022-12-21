@java.lang.Override
public void bindAdapter() {
    model = new cn.edu.jxnu.awesome_campus.model.library.BookBorrowedModel();
    try {
        adapter = new cn.edu.jxnu.awesome_campus.support.adapter.library.BookBorrowedAdapter(getActivity(), model);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    recyclerView.setAdapter(adapter);
}
