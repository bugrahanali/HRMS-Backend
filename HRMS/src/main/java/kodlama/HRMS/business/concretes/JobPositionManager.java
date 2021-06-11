package kodlama.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.HRMS.business.abstracts.JobPositionsService;
import kodlama.HRMS.core.utilities.results.DataResult;
import kodlama.HRMS.core.utilities.results.ErrorResult;
import kodlama.HRMS.core.utilities.results.Result;
import kodlama.HRMS.core.utilities.results.SuccessDataResult;
import kodlama.HRMS.core.utilities.results.SuccessResult;
import kodlama.HRMS.dataAccess.abstracts.JobPositionDao;
import kodlama.HRMS.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionsService{

	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositonDao) {
		super();
		this.jobPositionDao = jobPositonDao;
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(), "tüm iş pozisyonları getirildi");
	}

	@Override
	public Result add(JobPosition jobPosition) {
		if(getJobByPosition(jobPosition.getPosition()).getData() != null){
			return new ErrorResult("Bu pozisyon zaten sistemde var.");
		}
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult("Sisteme pozisyon eklendi");
	}

	
	@Override
	public DataResult<JobPosition> getJobByPosition(String position) {
		
		return new SuccessDataResult<JobPosition>(this.jobPositionDao.getByPosition(position));
	}

}
