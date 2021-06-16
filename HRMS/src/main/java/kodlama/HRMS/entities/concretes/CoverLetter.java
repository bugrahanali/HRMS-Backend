package kodlama.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "cv_coverletters")
@AllArgsConstructor
@NoArgsConstructor
public class CoverLetter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int	 id;
	
	@NotNull
	@NotBlank
	@Column(name = "content")
	private String content;
	
	@ManyToOne
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;
	

	@ManyToOne
	@JoinColumn(name="candidate_cv_id")
	@JsonIgnore
	private Candidate_cv candidate_cv;
}
