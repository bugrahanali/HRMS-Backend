package kodlama.HRMS.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
@Table(name = "candidates")
public class Candidate extends User {
	@Column(name = "first_name")
	private String firstName;
		
	@Column(name = "last_name")
	private String lastName;

	@Column(name = "identity_number")
	private String identityNumber;

	@Column(name = "date_of_birth")
	private int birthDate;

	// @OneToMany(mappedBy = "candidate")
	// private List<Verification_Candidate> verification_Candidates;

	@OneToMany(mappedBy = "candidate")
	@JsonIgnore
	private List<School> schools;

	@OneToMany(mappedBy = "candidate")
	@JsonIgnore
	private List<Link> links;

	@OneToMany(mappedBy = "candidate")
	@JsonIgnore
	private List<ProgrammingSkill> skills;

	@OneToMany(mappedBy = "candidate")
	@JsonIgnore
	private List<CoverLetter> coverLetters;
}
