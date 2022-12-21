@java.lang.Override
public void onClick(android.view.View v) {
    try {
        switch(v.getId()) {
            case R.id.wait_imageview:
                waitButtonAction(id);
                break;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
