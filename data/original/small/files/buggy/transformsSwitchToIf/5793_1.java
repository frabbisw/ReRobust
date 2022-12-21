@java.lang.Override
public void onClick(android.view.View v) {
    if (v.getId() == R.id.btn_addcompany) {
        addCompany();
    } else if (v.getId() == R.id.btn_add_category) {
        addCategory(v);
    }
}
