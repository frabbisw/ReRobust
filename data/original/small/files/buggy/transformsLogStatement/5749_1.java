public void removeCalendarEventProvider(org.wilson.world.festival.CalendarEventProvider provider) {
    System.out.println("log");
    if ((provider != null) && ((provider.getName()) != null)) {
        this.providers.remove(provider.getName(), provider);
    }
}
