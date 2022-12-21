public void changeRelationType(int type) {
    try {
        if ((selectedRelation) != null) {
            selectedRelation.setRelationType(type);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
