package sunflower.service;

import org.springframework.stereotype.Service;
import sunflower.configuration.UserContext;
import sunflower.entity.Commodity;
import sunflower.repository.CommodityRepository;

import java.util.UUID;

@Service
public class CommodityService {
    private final CommodityRepository commodityRepository;

    public CommodityService(CommodityRepository commodityRepository) {
        this.commodityRepository = commodityRepository;
    }

    public Commodity repoCommodity(Commodity commodity) {
        commodity.setSku(UUID.randomUUID().toString());
        commodity.setCreatedBy(UserContext.getUser());
        return commodityRepository.save(commodity);
    }

    public String getPicUrlFromCommodity(String sku) {
        return commodityRepository.getPicUrlFromCommodity(sku);
    }
}
