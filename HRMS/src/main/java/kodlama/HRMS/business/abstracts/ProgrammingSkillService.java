package kodlama.HRMS.business.abstracts;

import java.util.List;

import kodlama.HRMS.core.utilities.results.DataResult;
import kodlama.HRMS.core.utilities.results.Result;
import kodlama.HRMS.entities.concretes.ProgrammingSkill;

public interface ProgrammingSkillService {

	Result add(ProgrammingSkill programmingSkill);
	Result delete(int id);
	Result update(ProgrammingSkill programmingSkill);
	DataResult<ProgrammingSkill> getById(int id);
	DataResult<List<ProgrammingSkill>> getByCandidate_Id(int id);
}
