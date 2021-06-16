package kodlama.HRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlama.HRMS.entities.concretes.ProgrammingSkill;

public interface ProgrammingSkillDao extends JpaRepository<ProgrammingSkill, Integer>{
	@Query("From ProgrammingSkill where id =:id ")
	ProgrammingSkill getById(int id);	
	@Query("From ProgrammingSkill where candidate_id =:id ")
	List<ProgrammingSkill> getByCandidate_Id(int id);
}
