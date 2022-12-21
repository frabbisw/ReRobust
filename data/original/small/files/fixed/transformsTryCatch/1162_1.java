private void encounterRender() {
    int option = getOption();
    try {
        switch(option) {
            case 0:
                fight();
                break;
            case 1:
                flee();
                break;
            default:
                return;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
