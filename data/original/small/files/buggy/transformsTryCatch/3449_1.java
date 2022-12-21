@java.lang.Override
public void updatePrgoramStatus(int programId, boolean isDisabled) {
    gov.va.escreening.entity.Program program = programRepository.findOne(programId);
    try {
        program.setIsDisabled(isDisabled);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    programRepository.update(program);
}
