package kodlama.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Verification_candidate")
@Entity
public class Verification_Candidate {
	
	@Id
	@Column(name="id")
	private int id;
	
	@JoinColumn(name = "candidate_id")
	private int candidate_id;
	
	@JoinColumn(name = "employer_id")
	private int employer_id;
	
	@Column(name = "is_confirmed")
	private boolean is_confirmed;
	

}
