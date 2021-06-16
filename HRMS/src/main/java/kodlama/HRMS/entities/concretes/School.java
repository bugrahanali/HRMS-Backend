package kodlama.HRMS.entities.concretes;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cv_schools")
public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "school_name")
	@NotNull()
	private String schoolName;

	@NotNull
	@NotBlank
	@Column(name = "departman")
	private String departman;

	@NotNull
	@NotBlank
	@Column(name = "start_date")
	private LocalDateTime start_date;

	@Column(name = "graduation_date", nullable = true)
	private LocalDateTime graduated_date;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="candidate_id")
	private Candidate candidate;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="candidate_cv_id")
	private Candidate_cv candidate_cv;

}
