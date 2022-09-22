package com.systems.pos.topics.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.systems.pos.topics.entity.Topic;
import com.systems.pos.topics.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService 
{
	
	@Autowired
	private TopicRepository topicRepository;
	
	 public List<Topic> getAllTopics()
	 {
		
		 List<Topic> topics = new ArrayList<>();
		 topicRepository.findAll()
		 .forEach(topics::add);
		 return topics;
	 }
	 
	 public Topic getTopic(String id) 
	 {
		 Optional<Topic> opTopic = topicRepository.findById(id);
		 if(opTopic.isPresent())
		 {
			 return opTopic.get();
		 }
		 return null;
		
	 }
	public void addTopic(Topic topic)
	{
		topicRepository.save(topic);
	}
	
	public void updateTopic(String id, Topic topic)
	{
		topicRepository.save(topic);
		
	}
	public void deleteTopic(String id)
	{
		topicRepository.deleteById(id);
	}
}
