package kodlama.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.HRMS.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
