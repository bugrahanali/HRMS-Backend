package kodlama.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.HRMS.business.abstracts.SchoolService;
import kodlama.HRMS.core.utilities.results.DataResult;
import kodlama.HRMS.core.utilities.results.Result;
import kodlama.HRMS.core.utilities.results.SuccessDataResult;
import kodlama.HRMS.core.utilities.results.SuccessResult;
import kodlama.HRMS.dataAccess.abstracts.SchoolDao;
import kodlama.HRMS.entities.concretes.School;

@Service
public class SchoolManager implements SchoolService{

	@Autowired
	private SchoolDao SchoolDao;
		
	public SchoolManager(kodlama.HRMS.dataAccess.abstracts.SchoolDao schoolDao) {
		super();
		SchoolDao = schoolDao;
	}

	@Override
	public DataResult<List<School>> getAll() {
		
		return new SuccessDataResult<List<School>>(this.SchoolDao.findAll(), "tüm okullar getirildi");
	}

	@Override
	public Result add(School school) {
		this.SchoolDao.save(school);
		return new SuccessResult("yeni okul eklendi");
	}

	@Override
	public DataResult<School> getById(int id) {
		
		return new SuccessDataResult<School>(this.SchoolDao.findbyId(id), "id ye göre getirildi");
	}

}
