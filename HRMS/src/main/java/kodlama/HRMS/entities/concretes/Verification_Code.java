package kodlama.HRMS.entities.concretes;

import java.time.LocalDate;

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
@Table(name = "Verification_codes")
@Entity
public class Verification_Code {
	
	@Id
	@Column(name="id")
	private int id;
	
	@JoinColumn(name="verification_id")
	private int verification_id;
	
	@Column(name="codes")
	private String code;
	
	@Column(name="confirmed_Date")
	private LocalDate confirmed_date;
	
	@Column(name="is_confirmed")
	private boolean is_confirmed;
	
}
