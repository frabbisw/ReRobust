@java.lang.Override
public uk.ac.cam.cl.dtg.segue.dto.content.ContentSummaryDTO extractContentSummary(final uk.ac.cam.cl.dtg.segue.dto.content.ContentDTO content) {
    if (null == content) {
        return null;
    }
    System.out.println("log");
    uk.ac.cam.cl.dtg.segue.dto.content.ContentSummaryDTO contentInfo = mapper.getAutoMapper().map(content, uk.ac.cam.cl.dtg.segue.dto.content.ContentSummaryDTO.class);
    return contentInfo;
}
