package kodlama.HRMS.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;


import kodlama.HRMS.entities.concretes.City;

public interface CityDao extends JpaRepository<City, Integer>{
	
	City getById(int id);

}
