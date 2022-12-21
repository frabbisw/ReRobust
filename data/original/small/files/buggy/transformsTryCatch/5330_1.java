@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    try {
        switch(which) {
            case android.content.DialogInterface.BUTTON_POSITIVE:
                deletePartOfTheMethod(id);
                break;
            case android.content.DialogInterface.BUTTON_NEGATIVE:
                break;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
