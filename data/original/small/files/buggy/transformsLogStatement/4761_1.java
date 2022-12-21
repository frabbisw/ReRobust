@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    System.out.println("log");
    return amai.org.conventions.events.activities.ProgrammeDayFragment.newInstance(getDate(position), delayScrolling, new amai.org.conventions.map.AggregatedEventTypes().get(ConventionsApplication.settings.getProgrammeSearchCategories(getApplicationContext())));
}
