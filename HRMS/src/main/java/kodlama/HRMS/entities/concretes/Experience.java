package kodlama.HRMS.entities.concretes;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "cv_experiences")
@AllArgsConstructor
@NoArgsConstructor
public class Experience {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "working_place")
	@NotNull
	@NotBlank
	private String working_place;

	@NotNull
	@NotBlank
	@Column(name = "position")
	private String position;

	@NotBlank
	@NotNull
	@Column(name = "start_date")
	private LocalDateTime startDate;

	@Column(name = "leave_date")
	private LocalDateTime leaveDate;

	@ManyToOne
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="candidate_cv_id")
	private Candidate_cv candidate_cv;



}
