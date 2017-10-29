/**
 * 版权所有 v8en.com
 * 
 * 作者： Simon
 */
package com.v8en.cloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.v8en.cloud.domain.User;

/**
 * @author Simon
 * web-site : www.v8en.com
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
