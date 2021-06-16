package kodlama.HRMS.business.abstracts;

import java.util.List;

import kodlama.HRMS.core.utilities.results.DataResult;
import kodlama.HRMS.core.utilities.results.Result;
import kodlama.HRMS.entities.concretes.City;

public interface CityService {

	DataResult<List<City>> getAll();
	DataResult<City> getById(int id);
	Result add(City city);
}
