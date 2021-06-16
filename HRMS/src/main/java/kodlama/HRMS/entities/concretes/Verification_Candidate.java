package kodlama.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "verification_candidate")
@Entity
public class Verification_Candidate {
	
	@Id
	@Column(name="id")
	private int id;
	
	//@ManyToOne()
	//@JoinColumn(name = "candidate_id")
	//private Candidate candidate_id;
	
	//@ManyToOne()
	//@JoinColumn(name = "employer_id")
	//private Employer employer;
	
	@Column(name = "is_confirmed")
	private boolean is_confirmed;
	
	@Column(name = "code")
	private boolean code;
	

}
