package kodlama.HRMS.business.concretes;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.HRMS.business.abstracts.CandidateService;
import kodlama.HRMS.core.utilities.results.DataResult;
import kodlama.HRMS.core.utilities.results.ErrorResult;
import kodlama.HRMS.core.utilities.results.Result;
import kodlama.HRMS.core.utilities.results.SuccessDataResult;
import kodlama.HRMS.core.utilities.results.SuccessResult;
import kodlama.HRMS.dataAccess.abstracts.CandidateDao;
import kodlama.HRMS.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService{

	private CandidateDao candidateDao;
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}
	
	private boolean validationForCandidate(Candidate candidate) {
		if (Objects.isNull(candidate.getIdentityNumber()) || Objects.isNull(candidate.getFirstName()) || Objects.isNull(candidate.getLastName()) 
				|| Objects.isNull(candidate.getEmail()) || Objects.isNull(candidate.getPasswords()) || Objects.isNull(candidate.getBirthDate())) {
			return false;
		}
		
	  return true;
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(), "Candidate listelendi");	}

	@Override
	public Result add(Candidate candidate) {
		if(!validationForCandidate(candidate)) {
			return new ErrorResult("Eksik bilgi girdiniz. Lütfen bilgilerinizi tekrar kontrol edin.");
		}
		if(getByEmail(candidate.getEmail()).getData()!=null){
			return new ErrorResult("Bu e-posta adresi zaten var.");
		}
		this.candidateDao.save(candidate);
		return new SuccessResult("Candidate eklendi.");
	}

	@Override
	public DataResult<Candidate> getByEmail(String email) {
		
		return new SuccessDataResult<Candidate>(this.candidateDao.findByEmail(email), "email adresine göre getirildi");
	}

	@Override
	public DataResult<Candidate> getByIdentityNumber(String identityNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
