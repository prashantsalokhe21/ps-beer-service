package com.prashant21tube.psbeerservice.web.controller;

import com.prashant21tube.psbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Project: ps-beer-service
 * Package: com.prashant21tube.psbeerservice.web.controller
 * <p>
 * User: lenovo
 * Date: 5/16/2020
 * Time: 2:13 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> findBeerById(@PathVariable(name = "beerId") UUID beerId,
                                            @RequestParam(name = "showInventoryOnHand", required = false) String showInventoryOnHand) {
        //TODO impl
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerObj) {
        //TODO impl
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable(name = "beerId") UUID beerId, @RequestBody BeerDto beerObj) {
        //TODO impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
