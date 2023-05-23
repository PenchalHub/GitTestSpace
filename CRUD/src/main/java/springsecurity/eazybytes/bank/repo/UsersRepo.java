package springsecurity.eazybytes.bank.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import springsecurity.eazybytes.bank.model.Users;

@Repository
public interface UsersRepo extends  CrudRepository<Users, Long> {

	List<Users> findAll();

}
