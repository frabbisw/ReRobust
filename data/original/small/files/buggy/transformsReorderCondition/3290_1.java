@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    float scale = de.tucottbus.kt.drakon.DRAKON.drakonChart.getScale();
    if (0.2F < scale) {
        de.tucottbus.kt.drakon.DRAKON.drakonChart.setScale(((de.tucottbus.kt.drakon.DRAKON.drakonChart.getScale()) - 0.1F));
        de.tucottbus.kt.drakon.DRAKON.drakonChart.pack();
    }
}
