package kodlama.HRMS.business.abstracts;

import java.util.List;

import kodlama.HRMS.core.utilities.results.DataResult;
import kodlama.HRMS.core.utilities.results.Result;
import kodlama.HRMS.entities.concretes.JobAdvert;

public interface JobAdvertService {

	Result add(JobAdvert jobAdvert);

	Result update(JobAdvert jobAdvert);

	DataResult<List<JobAdvert>> getAll();

	DataResult<List<JobAdvert>> getAllSortedByDate();

	DataResult<JobAdvert> findById(int id);

	DataResult<List<JobAdvert>> getAllActiveJobAdvert();

	DataResult<List<JobAdvert>> findAllByOrderByPublishedAtDesc();

	DataResult<List<JobAdvert>> getAllActiveJobAdvertByEmployer(int id);

	Result changeOpenToClose(int id);

}
