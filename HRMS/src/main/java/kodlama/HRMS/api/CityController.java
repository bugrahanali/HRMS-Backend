package kodlama.HRMS.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.HRMS.business.abstracts.CityService;
import kodlama.HRMS.core.utilities.results.DataResult;
import kodlama.HRMS.core.utilities.results.Result;
import kodlama.HRMS.entities.concretes.City;
@RestController
@RequestMapping("/api/city")
public class CityController {
	@Autowired
	private CityService cityService;

	public CityController(CityService cityService) {
		super();
		this.cityService = cityService;
	}
	
	@GetMapping("/api/getall")
	public DataResult<List<City>> getAll() {
		return this.cityService.getAll();
	}
	
	@GetMapping("/api/getById")
	public DataResult<City> getById(int id) { 
		return this.cityService.getById(id);
	}
	
	@PostMapping("/api/add")
	public Result add (@RequestBody City city) {
		return this.cityService.add(city);
	}
}
