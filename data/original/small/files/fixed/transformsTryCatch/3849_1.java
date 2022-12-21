public static void changeMode(com.daquexian.chaoli.forum.viewmodel.BaseViewModel viewModel) {
    try {
        if (com.daquexian.chaoli.forum.meta.NightModeHelper.isDay()) {
            com.daquexian.chaoli.forum.meta.NightModeHelper.setNight();
        } else {
            com.daquexian.chaoli.forum.meta.NightModeHelper.setDay();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.daquexian.chaoli.forum.meta.NightModeHelper.mViewModel = viewModel;
}
