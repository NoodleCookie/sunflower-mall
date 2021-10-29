package sunflower.controller;

import org.springframework.web.bind.annotation.*;
import sunflower.entity.Commodity;
import sunflower.service.CommodityService;

@RestController
public class MallController {

    private final CommodityService commodityService;

    public MallController(CommodityService commodityService) {
        this.commodityService = commodityService;
    }

    @GetMapping("/commodity/pic/{sku}")
    public String getCommodityPic(@PathVariable("sku") String sku) {
        return commodityService.getPicUrlFromCommodity(sku);
    }

    @PostMapping("/commodity")
    public Commodity saveCommodity(@RequestBody Commodity commodity) {
        return commodityService.repoCommodity(commodity);
    }
}
