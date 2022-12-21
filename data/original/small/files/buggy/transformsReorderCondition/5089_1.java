public void done(reli.reliapp.co.il.reli.dataStructures.Discussion currentDiscussion, com.parse.ParseException e) {
    if (null == e) {
        fetchDiscussionInformation(v, currentDiscussion);
    }
    dia.dismiss();
}
