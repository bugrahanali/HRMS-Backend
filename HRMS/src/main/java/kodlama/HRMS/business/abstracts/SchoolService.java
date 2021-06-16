package kodlama.HRMS.business.abstracts;

import java.util.List;

import kodlama.HRMS.core.utilities.results.DataResult;
import kodlama.HRMS.core.utilities.results.Result;
import kodlama.HRMS.entities.concretes.School;

public interface SchoolService {

	DataResult<List<School>> getAll();

	Result add(School school);

	DataResult<School> getById(int id);
}
