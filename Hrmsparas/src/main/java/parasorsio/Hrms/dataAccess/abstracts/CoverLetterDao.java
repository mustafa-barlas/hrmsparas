package parasorsio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import parasorsio.Hrms.entities.concretes.CoverLetter;

public interface CoverLetterDao extends JpaRepository<CoverLetter, Integer> {

	CoverLetter getByCoverLetterId(int coverLetterId);

	List<CoverLetter> getByCoverLetterText(String coverLetterText);

}
