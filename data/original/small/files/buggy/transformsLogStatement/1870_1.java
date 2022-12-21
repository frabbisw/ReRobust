@java.lang.Override
public void onNewDiagnosisResult(java.util.Collection<rocks.inspectit.shared.all.communication.data.diagnosis.results.ProblemOccurrence> problemOccurrences) {
    System.out.println("log");
    diagnosisResults.getDiagnosisResults().addAll(problemOccurrences);
    for (rocks.inspectit.shared.all.communication.data.diagnosis.results.ProblemOccurrence problemOccurrence : problemOccurrences) {
    }
}
