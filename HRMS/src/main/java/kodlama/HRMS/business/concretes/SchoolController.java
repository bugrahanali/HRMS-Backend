package kodlama.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.HRMS.business.abstracts.SchoolService;
import kodlama.HRMS.core.utilities.results.DataResult;
import kodlama.HRMS.core.utilities.results.Result;
import kodlama.HRMS.entities.concretes.School;

@RestController
@RequestMapping("/api/school")
public class SchoolController {
	@Autowired
	private SchoolService schoolService;

	public SchoolController(SchoolService schoolService) {
		super();
		this.schoolService = schoolService;
	};
	
	@PostMapping("/add")
	public Result add(@RequestBody School School) {
		return this.schoolService.add(School);
		}
	@GetMapping("/getall")
	public DataResult<List< School>> getAll() {
		return this.schoolService.getAll();
	}

	@GetMapping("/getByid")
	public DataResult<School> getById(@RequestParam int id) {
		return this.schoolService.getById(id);
	}

	
	
	
}
