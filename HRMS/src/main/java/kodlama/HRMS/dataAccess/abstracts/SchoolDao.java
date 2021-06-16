package kodlama.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlama.HRMS.entities.concretes.School;

public interface SchoolDao  extends JpaRepository<School, Integer>{
	@Query("From School where id =:id ")
	School findbyId(int id);
}
