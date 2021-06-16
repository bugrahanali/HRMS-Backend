package kodlama.HRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.HRMS.entities.concretes.Candidate_cv;

public interface CandidateCvDao extends JpaRepository<Candidate_cv, Integer>{

	List<Candidate_cv> getByCandidateId(int id);
	
}
