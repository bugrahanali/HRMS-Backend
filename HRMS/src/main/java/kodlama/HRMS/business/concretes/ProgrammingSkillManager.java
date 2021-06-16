package kodlama.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.HRMS.business.abstracts.ProgrammingSkillService;
import kodlama.HRMS.core.utilities.results.DataResult;
import kodlama.HRMS.core.utilities.results.Result;
import kodlama.HRMS.core.utilities.results.SuccessDataResult;
import kodlama.HRMS.core.utilities.results.SuccessResult;
import kodlama.HRMS.dataAccess.abstracts.ProgrammingSkillDao;
import kodlama.HRMS.entities.concretes.ProgrammingSkill;
import kodlama.HRMS.entities.concretes.School;
@Service
public class ProgrammingSkillManager implements ProgrammingSkillService{
	
	@Autowired
	private ProgrammingSkillDao programmingSkillDao;
	
	
	public ProgrammingSkillManager(ProgrammingSkillDao programmingSkillDao) {
		super();
		this.programmingSkillDao = programmingSkillDao;
	}

	@Override
	public Result add(ProgrammingSkill programmingSkill) {
		this.programmingSkillDao.save(programmingSkill);
		return new SuccessResult("başarıyla eklendi.");
	}

	@Override
	public Result delete(int id) {
		this.programmingSkillDao.deleteById(id);;
		return new SuccessResult("başarıyla silindi");
	}

	@Override
	public Result update(ProgrammingSkill programmingSkill) {
		this.programmingSkillDao.save(programmingSkill);
		return new SuccessResult("başarıyla güncellendi.");
	}

	@Override
	public DataResult<ProgrammingSkill> getById(int id) {
		return new SuccessDataResult<ProgrammingSkill>(this.programmingSkillDao.getById(id), "id ye göre getirildi");
	}

	@Override
	public DataResult<List<ProgrammingSkill>> getByCandidate_Id(int id) {
		return new SuccessDataResult<List<ProgrammingSkill>>(this.programmingSkillDao.getByCandidate_Id(id), "id ye göre getirildi");
	}

}
