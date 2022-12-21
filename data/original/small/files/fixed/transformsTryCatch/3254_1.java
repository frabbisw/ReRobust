@java.lang.Override
public void push(edu.blackburn.cs.cs212sp16.triage.tebbevanwormer.Patient add) {
    edu.blackburn.cs.cs212sp16.triage.tebbevanwormer.ListElement newElement = new edu.blackburn.cs.cs212sp16.triage.tebbevanwormer.ListElement(add);
    try {
        newElement.setNext(newElement);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
