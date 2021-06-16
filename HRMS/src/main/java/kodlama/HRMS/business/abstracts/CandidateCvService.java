package kodlama.HRMS.business.abstracts;

import java.util.List;

import kodlama.HRMS.core.utilities.results.DataResult;
import kodlama.HRMS.core.utilities.results.Result;
import kodlama.HRMS.entities.concretes.Candidate_cv;

public interface CandidateCvService {

	DataResult<List<Candidate_cv>> getAll();
	
	Result add(Candidate_cv candidate_cv);
	
	DataResult<List<Candidate_cv>> getByCandidate_id(int id);
}
