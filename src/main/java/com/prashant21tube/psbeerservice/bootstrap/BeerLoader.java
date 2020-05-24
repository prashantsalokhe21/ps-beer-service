package com.prashant21tube.psbeerservice.bootstrap;

import com.prashant21tube.psbeerservice.domain.Beer;
import com.prashant21tube.psbeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Project: ps-beer-service
 * Package: com.prashant21tube.psbeerservice.bootstrap
 * <p>
 * User: lenovo
 * Date: 5/24/2020
 * Time: 6:19 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
       if (beerRepository.count() == 0) {
           beerRepository.save(Beer.builder()
                   .beerName("Mongo Bobs")
                   .beerStyle("IPA")
                   .minOnHand(12)
                   .upc(337010000001L)
                   .price(new BigDecimal("12.95"))
                   .quantityToBrew(300)
                   .build());

           beerRepository.save(Beer.builder()
                   .beerName("Galaxy Cat")
                   .beerStyle("PALE_ALE")
                   .minOnHand(12)
                   .upc(337010000002L)
                   .price(new BigDecimal("11.95"))
                   .quantityToBrew(300)
                   .build());
       }
    }
}
