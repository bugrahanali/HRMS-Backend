package kodlama.HRMS.business.abstracts;
import java.util.List;

import kodlama.HRMS.core.utilities.results.DataResult;
import kodlama.HRMS.core.utilities.results.Result;
import kodlama.HRMS.entities.concretes.JobPosition;

public interface JobPositionsService {
	
	DataResult<List<JobPosition>> getAll();
	
	Result add( JobPosition jobPosition);
	

	DataResult<JobPosition> getJobByPosition(String position);}
