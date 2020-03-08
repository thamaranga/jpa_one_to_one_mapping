package com.hasitha.jpa_one_to_one_mapping.repository;

import com.hasitha.jpa_one_to_one_mapping.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
}
