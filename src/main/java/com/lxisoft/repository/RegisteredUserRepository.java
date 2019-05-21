package com.lxisoft.repository;

import com.lxisoft.domain.RegisteredUser;

import java.util.Optional;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the RegisteredUser entity.
 */
@SuppressWarnings("unused")
@Repository
public interface RegisteredUserRepository extends JpaRepository<RegisteredUser, Long> {

	Optional<RegisteredUser> findByPhoneNumber(Long phoneNumber);
}
