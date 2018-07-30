package com.springframework.sfgpetclinic.services;

import com.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnserService {

    Owner findByLastName(String lastName);

    Owner findById(long id);

    Owner save (Owner owner);

    Set<Owner> findAll();
}
