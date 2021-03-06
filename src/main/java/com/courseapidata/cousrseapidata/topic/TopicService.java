package com.courseapidata.cousrseapidata.topic;

import com.courseapidata.cousrseapidata.Topic;
import com.courseapidata.cousrseapidata.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics(){
        //return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Optional<Topic> getTopic(String id){
       //return topics.stream().filter(t ->  t.getId().equals(id)).findFirst().get();
        return topicRepository.findById(id);
    }


    public void addTopic(Topic topic) {
        //topics.add(topic);
        topicRepository.save(topic);
    }


    public void updateTopic(String id, Topic topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
}
