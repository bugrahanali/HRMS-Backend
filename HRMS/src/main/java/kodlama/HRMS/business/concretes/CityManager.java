package kodlama.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.HRMS.business.abstracts.CityService;
import kodlama.HRMS.core.utilities.results.DataResult;
import kodlama.HRMS.core.utilities.results.Result;
import kodlama.HRMS.core.utilities.results.SuccessDataResult;
import kodlama.HRMS.core.utilities.results.SuccessResult;
import kodlama.HRMS.dataAccess.abstracts.CityDao;
import kodlama.HRMS.entities.concretes.City;

@Service
public class CityManager implements CityService{

	private CityDao cityDao;
	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public DataResult<List<City>> getAll() {
		
		return new SuccessDataResult<List<City>>(this.cityDao.findAll(), "tüm şehirler getirildi");
	}

	@Override
	public DataResult<City> getById(int id) {
		
		return new SuccessDataResult<City>(this.cityDao.getById(id), "id ye göre şehir getirildi");
	}

	@Override
	public Result add(City city) {
		this.cityDao.save(city);
		return new SuccessResult("başarıyla eklendi.");
	}

}
