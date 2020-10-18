package com.bdsprojectclient.bdsProjectClient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bdsprojectclient.bdsProjectClient.entities.Client;

public interface  ClientRepository extends JpaRepository<Client, Long> {

}
