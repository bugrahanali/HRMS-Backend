package kodlama.HRMS.entities.concretes;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="candidates_cv")
public class Candidate_cv {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@JsonIgnore
	@Column(name="created_date")
	private LocalDateTime createdAt = LocalDateTime.now();
	
	@Column(name="over_letter")
	private String overLetter;
	
	@Column(name="image_url")
	private String pictureUrl;
	
	@OneToOne
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;
	
	@OneToMany(mappedBy = "candidate_cv")
	private List<School> schools;

	@OneToMany(mappedBy = "candidate_cv")
	private List<ProgrammingSkill> skills;
	
	@OneToMany(mappedBy = "candidate_cv")
	private List<Link> links;

	
	@OneToMany(mappedBy = "candidate_cv")
	private List<ForeignLanguage> foreignLanguages;
	
	@OneToMany(mappedBy = "candidate_cv")
	private List<Experience> experiences;
	
	@OneToMany(mappedBy = "candidate_cv")
	private List<CoverLetter> coverLetters;


}
