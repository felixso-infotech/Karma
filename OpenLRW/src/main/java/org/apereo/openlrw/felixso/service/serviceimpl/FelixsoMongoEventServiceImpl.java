package org.apereo.openlrw.felixso.service.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.apereo.openlrw.caliper.service.repository.MongoEvent;
import org.apereo.openlrw.felixso.repository.FelixsoMongoEventRepository;
import org.apereo.openlrw.felixso.service.FelixsoMongoEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FelixsoMongoEventServiceImpl implements FelixsoMongoEventService {

	@Autowired
	FelixsoMongoEventRepository felixsoMongoEventRepository;

	@Override
	public List<MongoEvent> findAll() {
		return felixsoMongoEventRepository.findAll();
	}

	@Override
	public List<MongoEvent> findCompletedEvents() {
		List<MongoEvent> events = findAll();
		List<MongoEvent> temp = new ArrayList<MongoEvent>();
		for (MongoEvent me : events) {
			System.out.println(me.getEvent().getAction());
			if (me.getEvent().getAction().equals("http://purl.imsglobal.org/vocab/caliper/v1/action#Completed")) {
				temp.add(me);
			}
		}
		return temp;
	}

	@Override
	public List<MongoEvent> findStartedEvents() {
		List<MongoEvent> events = findAll();
		List<MongoEvent> temp = new ArrayList<MongoEvent>();
		for (MongoEvent me : events) {
			System.out.println(me.getEvent().getAction());
			if ((me.getEvent().getAction().equals("http://adlnet.gov/expapi/verbs/started"))
					|| (me.getEvent().getAction().equals("http://adlnet.gov/expapi/verbs/initialized"))) {
				temp.add(me);
			}
		}
		return temp;
	}
}
