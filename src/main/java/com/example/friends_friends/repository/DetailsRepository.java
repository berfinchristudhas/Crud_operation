package com.example.friends_friends.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.friends_friends.model.Details;

@Repository
public interface DetailsRepository extends JpaRepository<Details, Integer> {

}
