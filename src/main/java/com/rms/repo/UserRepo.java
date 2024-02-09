package com.rms.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.rms.bean.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
@Query(value="select * from tbl_users where user_type='Tenant'",nativeQuery=true)
List<User>viewAllTenants();

@Query(value="select * from tbl_users where user_type='HouseOwner'",nativeQuery=true)
List<User>viewAllHouseOwners();


 
public User findByUserEmail(String userEmail);
public User findByUserPassword(String userPassword);
}
