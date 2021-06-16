package kodlama.HRMS.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.HRMS.business.abstracts.JobAdvertService;
import kodlama.HRMS.core.utilities.results.DataResult;
import kodlama.HRMS.core.utilities.results.Result;

import kodlama.HRMS.entities.concretes.JobAdvert;

@RestController
@RequestMapping("/api/jobadverts")
public class JobAdvertController {

	@Autowired
	private JobAdvertService jobAdvertService;

	public JobAdvertController(JobAdvertService jobAdvertervice) {
		super();
		this.jobAdvertService = jobAdvertervice;
	}

	@GetMapping("/getall")
	public DataResult<List<JobAdvert>> getAll() {
		return this.jobAdvertService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody JobAdvert jobAdvert) {
		return this.jobAdvertService.add(jobAdvert);
	}

	@GetMapping("/getAllSortedByDate")
	public DataResult<List<JobAdvert>> getAllSortedByDate() {
		return this.jobAdvertService.getAllSortedByDate();
	}

	@GetMapping("/findById")
	public DataResult<JobAdvert> getById(int id) {
		return this.jobAdvertService.findById(id);
	}

	@GetMapping("/getAllActiveJobAdvert")
	public DataResult<List<JobAdvert>> getAllActiveJobAdvert() {
		return this.jobAdvertService.getAllActiveJobAdvert();
	}

	@GetMapping("/findAllByOrderByPublishedAtDesc")
	public DataResult<List<JobAdvert>> findAllByOrderByPublishedAtDesc() {
		return this.jobAdvertService.findAllByOrderByPublishedAtDesc();
	}

	@GetMapping("/getAllActiveJobAdvertByEmployer")
	public DataResult<List<JobAdvert>> getAllActiveJobAdvertByEmployer(int id) {
		return this.jobAdvertService.getAllActiveJobAdvertByEmployer(id);
	}

}
