package com.learn.kafka.jpa;

import org.springframework.data.repository.CrudRepository;

import com.learn.kafka.entity.LibraryEvent;

public interface LibraryEventsRepository extends CrudRepository<LibraryEvent,Integer> {
}
