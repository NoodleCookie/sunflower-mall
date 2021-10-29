package sunflower.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Data
@Entity
@Table(name = "sunflower_mall_commodity")
public class Commodity extends BaseEntity{
    @Id
    private String sku;

    private String commodityName;

    private String picUrl;
}
