package kodlama.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdverts"})
@Table(name="Cities")

public class City {
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="city_name")
	private String cityName;
	
	//@OneToMany(mappedBy = "city")
	//private List<JobAdvert> jobAdverts;

}