 /*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.felixsoinfotech.karma.service.impl;
/**
 * TODO Provide a detailed description here 
 * @author Owner
 * sarangibalu, sarangibalu.a@lxisoft.com
 */

import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.felixsoinfotech.karma.domain.enumeration.ProofType;
import com.felixsoinfotech.karma.domain.enumeration.Type;
import com.felixsoinfotech.karma.repository.ActivityRepository;
import com.felixsoinfotech.karma.repository.DimensionRepository;
import com.felixsoinfotech.karma.service.AggregateQueryService;
import com.felixsoinfotech.karma.service.dto.ActivityDTO;
import com.felixsoinfotech.karma.service.dto.DimensionDTO;
import com.felixsoinfotech.karma.service.mapper.ActivityMapper;
import com.felixsoinfotech.karma.service.mapper.DimensionMapper;

/**
 * Service Implementation for managing Queryservices
 */
@Service
@Transactional
public class AggregateQueryServiceImpl implements AggregateQueryService {

	private final Logger log = LoggerFactory.getLogger(AggregateQueryServiceImpl.class);

	private ActivityRepository activityRepository;

	private ActivityMapper activityMapper;
	
	private DimensionRepository dimensionRepository;
	
	private DimensionMapper dimensionMapper;

	public AggregateQueryServiceImpl(ActivityRepository activityRepository, ActivityMapper activityMapper,DimensionRepository dimensionRepository,DimensionMapper dimensionMapper) {
		this.activityRepository = activityRepository;
		this.activityMapper = activityMapper;
		this.dimensionRepository=dimensionRepository;
		this.dimensionMapper=dimensionMapper;
	}
	
	/**
	 * Get all the activities.
	 *
	 * @param pageable the pagination information
	 * @return the list of entities
	 */
	@Override
	@Transactional(readOnly = true)
	public Page<ActivityDTO> findAll(Pageable pageable) {
		log.debug("Request to get all Activities");
		return activityRepository.findAll(pageable).map(activityMapper::toDto);
	}
	
	/**
	 * Get all the enums ProofType.
	 *
	 * @return the list of enums
	 */
	@Override
	public List<ProofType> findAllEnumProofTypes(){
		
		log.debug("Request to get all Enum ProofTypes");
		
		ProofType[] ProofTypes=ProofType.values();
						
		return Arrays.asList(ProofTypes);
		
	}

	/**
	 * Get all the enums ProofType.
	 *
	 * @return the list of enums
	 */
	@Override
	public List<Type> findAllEnumTypes(){
		
		log.debug("Request to get all Enum ProofTypes");
		
		Type[] Types=Type.values();
						
		return Arrays.asList(Types);
		
	}
	
	/**
     * Get all the dimensions.
     *
     * @param pageable the pagination information
     * 
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public Page<DimensionDTO> findAllDimensions(Pageable pageable) {
        log.debug("Request to get all Dimensions");
        return dimensionRepository.findAll(pageable)
            .map(dimensionMapper::toDto);
    }


	
	/**
     * Get all the activities by challengeId.
     * 
	 * @param pageable the pagination information
	 * @param challengeId the challenge information
	 * @return the list of entities
	 */
	@Override
    @Transactional(readOnly = true) 
	public Page<ActivityDTO> findAllActivitiesByChallengeId(Pageable pageable,Long challengeId) { 
		log.debug("Request to get all Activities by ChallengeId");		
		return activityRepository.findAllActivitiesByChallengeId(pageable,challengeId).map(activityMapper::toDto);		
	
	}
	
	/**
	 * Get all the activities by CreatedDateAndTime.
	 * 
	 * @param pageable the pagination information
	 * @param createdDateAndTime the date information
	 * @return the list of entities
	 */ 
	@Override
	public Page<ActivityDTO> findAllActivitiesByCreatedDate(Pageable pageable,ZonedDateTime createdDate) {
		log.debug("Request to get all Activities by createdDateAndTime");		
		return activityRepository.findAllActivitiesByCreatedDate(pageable,createdDate).map(activityMapper::toDto);
	}

		

	/**
	 * Get all the Activity with eager load of many-to-many relationships.
	 *
	 * @return the list of entities
	 */
	public Page<ActivityDTO> findAllWithEagerRelationships(Pageable pageable) {
		return activityRepository.findAllWithEagerRelationships(pageable).map(activityMapper::toDto);
	}

	/**
	 * Get one activity by id.
	 *
	 * @param id the id of the entity
	 * @return the entity
	 */
	@Override
	@Transactional(readOnly = true)
	public Optional<ActivityDTO> findOne(Long id) {
		log.debug("Request to get Activity : {}", id);
		return activityRepository.findOneWithEagerRelationships(id).map(activityMapper::toDto);
	}

	
	
	
}
