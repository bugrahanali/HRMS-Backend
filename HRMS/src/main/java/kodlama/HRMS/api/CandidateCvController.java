package kodlama.HRMS.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.HRMS.business.abstracts.CandidateCvService;
import kodlama.HRMS.core.utilities.results.DataResult;
import kodlama.HRMS.core.utilities.results.Result;
import kodlama.HRMS.entities.concretes.Candidate_cv;

@RestController
@RequestMapping("/api/candidateCvController")
public class CandidateCvController {
	public CandidateCvService candidateCvService;

	@Autowired

	public CandidateCvController(CandidateCvService candidateCvService) {
		super();
		this.candidateCvService = candidateCvService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody Candidate_cv candidate_cv) {
		return this.candidateCvService.add(candidate_cv);
	}

	@GetMapping("/getall")
	public DataResult<List<Candidate_cv>> getAll() {
		return this.candidateCvService.getAll();
	}

	@GetMapping("/getByCandidate_id")
	public DataResult<List<Candidate_cv>> getByCandidate_id(@RequestParam int candidate) {
		return this.candidateCvService.getByCandidate_id(candidate);
	}

}