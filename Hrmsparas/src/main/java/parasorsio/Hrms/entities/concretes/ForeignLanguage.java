package parasorsio.Hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "foreign_languages")
@AllArgsConstructor
@NoArgsConstructor
public class ForeignLanguage{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "language_id")
	private int languageId;

	@Column(name = "language_name")
	private String languageName;

	@Min(value =1)
	@Max(value =5)
	@Column(name = "language_level")
	private int languageLevel;
	
	@OneToMany(mappedBy = "foreignLanguage")
	private List<JobSeeker> jobSeekers;
}
