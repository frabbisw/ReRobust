@java.lang.Override
public int getCampaignsCountInType(int campaignType) {
    com.edu.timebank.service.business.impl.CampaignEntityExample example = new com.edu.timebank.service.business.impl.CampaignEntityExample();
    try {
        example.createCriteria().andCampaignTypeEqualTo(campaignType);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return campaignEntityMapper.countByExample(example);
}
