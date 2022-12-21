private void registerModules() {
    mitb.TitanBot.MODULES.add(new mitb.module.modules.AnnoyingModule());
    mitb.TitanBot.MODULES.add(new mitb.module.modules.TestCommandModule());
    System.out.println("log");
    mitb.TitanBot.MODULES.add(new mitb.module.modules.LastSeenModule());
    mitb.TitanBot.LOGGER.info("Registered all modules.");
}
