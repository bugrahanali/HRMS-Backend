package kodlama.HRMS.business.concretes;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.HRMS.business.abstracts.EmployerService;
import kodlama.HRMS.core.utilities.results.DataResult;
import kodlama.HRMS.core.utilities.results.ErrorResult;
import kodlama.HRMS.core.utilities.results.Result;
import kodlama.HRMS.core.utilities.results.SuccessDataResult;
import kodlama.HRMS.core.utilities.results.SuccessResult;
import kodlama.HRMS.dataAccess.abstracts.EmployerDao;
import kodlama.HRMS.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{
	
	private EmployerDao employerDao;

	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}
	
	private boolean validationForEmployer(Employer employer) {
		if (Objects.isNull(employer.getCompanyName()) || Objects.isNull(employer.getWebAdress()) || Objects.isNull(employer.getEmail()) 
				|| Objects.isNull(employer.getTelefonNumber()) || Objects.isNull(employer.getPasswords())){
			return false;
		}
		
	  return true;
	}
	
	

	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "Employer listelendi");
	}

	@Override
	public DataResult<Employer> getByEmail(String email) {
		
		return new SuccessDataResult<Employer>( "Emaile göre getirildi.");
	}

	@Override
	public Result add(Employer employer) {
		if(getByEmail(employer.getEmail()).getData()!=null){
			return new ErrorResult("Bu Email zaten kullanılmaktadır.");
		}
		if(!this.validationForEmployer(employer)) {
			return new ErrorResult("You have entered incomplete information. Please check your information again.");
		}
		this.employerDao.save(employer);
		return new SuccessResult("Employer eklendi.");
		
	}
	
	

}
