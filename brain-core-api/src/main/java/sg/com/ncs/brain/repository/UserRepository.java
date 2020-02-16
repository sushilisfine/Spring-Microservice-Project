package sg.com.ncs.brain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sg.com.ncs.brain.user_maint.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	List<User> findByUsername(String username);

}