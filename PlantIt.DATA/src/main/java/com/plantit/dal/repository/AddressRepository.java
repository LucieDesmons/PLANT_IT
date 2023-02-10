package com.plantit.dal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.plantit.dal.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
