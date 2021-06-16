package kodlama.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.HRMS.business.abstracts.CandidateCvService;
import kodlama.HRMS.core.utilities.results.DataResult;
import kodlama.HRMS.core.utilities.results.Result;
import kodlama.HRMS.core.utilities.results.SuccessDataResult;
import kodlama.HRMS.core.utilities.results.SuccessResult;
import kodlama.HRMS.dataAccess.abstracts.CandidateCvDao;
import kodlama.HRMS.entities.concretes.Candidate_cv;

@Service
public class CandidateCvManager implements CandidateCvService{

	@Autowired
	private CandidateCvDao CandidateCvDao;
	
	public CandidateCvManager(kodlama.HRMS.dataAccess.abstracts.CandidateCvDao candidateCvDao) {
		super();
		CandidateCvDao = candidateCvDao;
	}

	@Override
	public DataResult<List<Candidate_cv>> getAll() {
		
		return new SuccessDataResult<List<Candidate_cv>>(this.CandidateCvDao.findAll(), "tüüm Cvler getirildi");
	}

	@Override
	public Result add(Candidate_cv candidate_cv) {
		this.CandidateCvDao.save(candidate_cv );
		return new SuccessResult("başarıyla eklendi");
	}

	@Override
	public DataResult<List<Candidate_cv>> getByCandidate_id(int id) {
		
		return new SuccessDataResult<List<Candidate_cv>>(this.CandidateCvDao.getByCandidateId(id), "id ye göre cv geldi");
	}

}
