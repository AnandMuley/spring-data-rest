package com.springdatarest.repositories;

import com.springdatarest.entities.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(path = "customers", exported = true)
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    @RestResource(path = "lastname")
    List<Customer> findByLastname(@Param("lastname") String lastname);

}
