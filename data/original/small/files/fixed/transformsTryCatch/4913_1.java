@org.springframework.web.bind.annotation.GetMapping(value = "/settingWebsite/banners")
public java.lang.String managementBanner(org.springframework.ui.Model model) {
    model.addAttribute(com.shop.svitnagorod.controller.AdminController.BANNERS, bannerService.findAll());
    try {
        model.addAttribute(com.shop.svitnagorod.controller.AdminController.BANNER, new com.shop.svitnagorod.DTO.BannerDTO());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return "managementBanners";
}
