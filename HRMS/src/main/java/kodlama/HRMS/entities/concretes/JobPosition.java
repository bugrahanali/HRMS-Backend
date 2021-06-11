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
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "jobAdverts" })
@Entity
@Table(name = "job_positions")
public class JobPosition {
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "position")
	private String position;

	//@OneToMany(mappedBy = "jobPosition")
	//private List<JobAdvert> jobAdverts;
 
}