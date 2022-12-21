@java.lang.Override
public uk.ac.cam.cl.dtg.segue.dto.content.ContentSummaryDTO extractContentSummary(final uk.ac.cam.cl.dtg.segue.dto.content.ContentDTO content) {
    if (content == null) {
        return null;
    }
    uk.ac.cam.cl.dtg.segue.dto.content.ContentSummaryDTO contentInfo = mapper.getAutoMapper().map(content, uk.ac.cam.cl.dtg.segue.dto.content.ContentSummaryDTO.class);
    return contentInfo;
}
