public void done(reli.reliapp.co.il.reli.dataStructures.Discussion currentDiscussion, com.parse.ParseException e) {
    try {
        if (e == null) {
            fetchDiscussionInformation(v, currentDiscussion);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    dia.dismiss();
}
