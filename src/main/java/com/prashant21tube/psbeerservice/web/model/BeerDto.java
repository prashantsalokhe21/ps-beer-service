package com.prashant21tube.psbeerservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
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
    @Null
    private UUID id;
    @Null
    private Integer version;

    @NotBlank
    private String beerName;
    @NotNull
    private BeerStyleEnum beerStyle;
    @NotNull
    @Positive
    private Long upc;

    @Null
    private OffsetDateTime createdDate;
    @Null
    private OffsetDateTime modifiedDate;

    @NotNull
    @Positive
    private BigDecimal price;
    private Integer quantityInHand;

}
