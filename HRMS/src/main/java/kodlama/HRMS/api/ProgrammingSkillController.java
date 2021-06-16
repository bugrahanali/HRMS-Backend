package kodlama.HRMS.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.HRMS.business.abstracts.ProgrammingSkillService;
import kodlama.HRMS.core.utilities.results.DataResult;
import kodlama.HRMS.core.utilities.results.Result;
import kodlama.HRMS.entities.concretes.ProgrammingSkill;

@RequestMapping("/api/ProgrammingSkill")
@RestController
public class ProgrammingSkillController {
	
	@Autowired
	private ProgrammingSkillService programmingSkillService;

	public ProgrammingSkillController(ProgrammingSkillService programmingSkillService) {
		super();
		this.programmingSkillService = programmingSkillService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody ProgrammingSkill programmingSkill) {
		return this.programmingSkillService.add(programmingSkill);
	}
	
	@GetMapping("/getById")
	public DataResult<ProgrammingSkill> getById(int id) {
		return this.programmingSkillService.getById(id);
	}
	
	@GetMapping("/getByCandidateId")
	public DataResult<List<ProgrammingSkill>> getByCandidateId(int id) {
		return this.programmingSkillService.getByCandidate_Id(id);
	}
}
