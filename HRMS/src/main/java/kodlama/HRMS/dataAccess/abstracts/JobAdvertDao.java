package kodlama.HRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import kodlama.HRMS.entities.concretes.JobAdvert;

public interface JobAdvertDao extends JpaRepository<JobAdvert, Integer> {

	@Query(" From JobAdvert where is_open=true")
	List<JobAdvert> getAllActiveJobAdvert();

	@Query("From JobAdvert where is_open=true order By published_date Desc")
	List<JobAdvert> findAllByOrderByPublishedAtDesc();

	@Query("From JobAdvert where is_open = true and employer_id =:id")
	List<JobAdvert> getAllActiveJobAdvertByEmployer(int id);
	
	@Query("From JobAdvert where id =:id")
	JobAdvert findById(int id);
}
