package kodlama.HRMS.business.abstracts;

import java.util.List;

import kodlama.HRMS.core.utilities.results.DataResult;
import kodlama.HRMS.core.utilities.results.Result;
import kodlama.HRMS.entities.concretes.Employer;

public interface EmployerService {

	DataResult<List<Employer>> getAll();

	DataResult<Employer> getByEmail(String email);

	Result add(Employer employer);
}
