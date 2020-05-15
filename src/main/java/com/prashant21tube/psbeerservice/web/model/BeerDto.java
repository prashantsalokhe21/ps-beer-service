package com.prashant21tube.psbeerservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Project: ps-beer-service
 * Package: com.prashant21tube.psbeerservice.web.model
 * <p>
 * User: lenovo
 * Date: 5/16/2020
 * Time: 1:04 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    private UUID id;
    private Integer version;

    private String beerName;
    private BeerStyleEnum beerStyle;
    private String ups;

    private OffsetDateTime createdDate;
    private OffsetDateTime modifiedDate;

    private BigDecimal price;
    private Integer quantityInHand;

}
