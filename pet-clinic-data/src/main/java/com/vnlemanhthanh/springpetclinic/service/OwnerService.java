/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.springpetclinic.service;

import com.vnlemanhthanh.springpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);
    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
