/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.springpetclinic.service;

import com.vnlemanhthanh.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
