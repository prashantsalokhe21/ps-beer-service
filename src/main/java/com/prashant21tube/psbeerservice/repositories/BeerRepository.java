package com.prashant21tube.psbeerservice.repositories;

import com.prashant21tube.psbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Project: ps-beer-service
 * Package: com.prashant21tube.psbeerservice.repositories
 * <p>
 * User: lenovo
 * Date: 5/24/2020
 * Time: 12:42 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
