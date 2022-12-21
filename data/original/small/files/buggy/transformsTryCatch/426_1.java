private void registerModules() {
    mitb.TitanBot.MODULES.add(new mitb.module.modules.AnnoyingModule());
    mitb.TitanBot.MODULES.add(new mitb.module.modules.TestCommandModule());
    mitb.TitanBot.MODULES.add(new mitb.module.modules.LastSeenModule());
    try {
        mitb.TitanBot.LOGGER.info("Registered all modules.");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
