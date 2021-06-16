package kodlama.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlama.HRMS.business.abstracts.JobAdvertService;
import kodlama.HRMS.core.utilities.results.DataResult;
import kodlama.HRMS.core.utilities.results.Result;
import kodlama.HRMS.core.utilities.results.SuccessDataResult;
import kodlama.HRMS.core.utilities.results.SuccessResult;
import kodlama.HRMS.dataAccess.abstracts.JobAdvertDao;
import kodlama.HRMS.entities.concretes.JobAdvert;

@Service
public class JobAdvertManager implements JobAdvertService {
	private JobAdvertDao jobAdvertDao;

	@Autowired
	public JobAdvertManager(JobAdvertDao jobAdvertDao) {
		super();
		this.jobAdvertDao = jobAdvertDao;
	}

	@Override
	public Result add(JobAdvert jobAdvert) {
		this.jobAdvertDao.save(jobAdvert);
		return new SuccessResult("iş ilanını başarıyla yüklendi");
	}

	@Override
	public Result update(JobAdvert jobAdvert) {
		this.jobAdvertDao.save(jobAdvert);
		return new SuccessResult("iş ilanını başarıyla yüklendi");
	}

	@Override
	public DataResult<List<JobAdvert>> getAll() {
		
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findAll(), "tüm iş ilanları listelendi");
	}

	@Override
	public DataResult<List<JobAdvert>> getAllSortedByDate() {
		Sort sort =Sort.by(Sort.Direction.DESC,"applicationDeadline");
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findAll(sort));
	}

	@Override
	public DataResult<JobAdvert> findById(int id) {
		return new SuccessDataResult<JobAdvert>(this.jobAdvertDao.findById(id), "Verilen Id ile ilan getirildi");
	}

	@Override
	public DataResult<List<JobAdvert>> getAllActiveJobAdvert() {
		
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getAllActiveJobAdvert(), "Tüm aktif ilanlar getirildi.");
	}

	@Override
	public DataResult<List<JobAdvert>> findAllByOrderByPublishedAtDesc() {
		
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findAllByOrderByPublishedAtDesc(), "yayınlanma tarihine göre getirildi.")
;	}

	@Override
	public DataResult<List<JobAdvert>> getAllActiveJobAdvertByEmployer(int id) {
		
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getAllActiveJobAdvertByEmployer(id), "yayınlanma tarihine göre getirildi.");
	}

	@Override
	public Result changeOpenToClose(int id) {
		
		return null;
	}

}
