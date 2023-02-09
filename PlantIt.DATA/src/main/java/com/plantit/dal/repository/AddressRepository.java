package com.plantit.dal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.plantit.dal.model.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, Integer> {

}
