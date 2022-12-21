private void encounterRender() {
    int option = getOption();
    if (option == 0) {
        {
            fight();
            break;
        }
    } else if (option == 1) {
        {
            flee();
            break;
        }
    } else if (option == 2) {
        {
            return;
        }
    }
}
