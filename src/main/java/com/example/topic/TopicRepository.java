package com.example.topic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopicRepository extends CrudRepository<Topic, Long> {

    List<Topic> findByName(String name);

    void deleteByName(String name);
}
