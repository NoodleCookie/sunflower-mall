package sunflower.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import sunflower.entity.Commodity;

@Repository
public interface CommodityRepository extends JpaRepository<Commodity, String> {

    @Query("select c.picUrl from Commodity c where c.sku=?1")
    String getPicUrlFromCommodity(String sku);
}
