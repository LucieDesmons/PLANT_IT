package com.plantit.dal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.plantit.dal.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
