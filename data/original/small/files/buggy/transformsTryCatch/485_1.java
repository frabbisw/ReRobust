@java.lang.Override
public void done(java.util.List<reli.reliapp.co.il.reli.dataStructures.Discussion> li, com.parse.ParseException e) {
    try {
        dia.dismiss();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    ((android.widget.TextView) (bla.findViewById(textId))).setText(java.lang.Integer.toString(li.size()));
}
