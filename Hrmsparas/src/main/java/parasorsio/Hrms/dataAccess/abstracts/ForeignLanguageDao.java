package parasorsio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import parasorsio.Hrms.entities.concretes.ForeignLanguage;

public interface ForeignLanguageDao extends JpaRepository<ForeignLanguage, Integer> {

	ForeignLanguage getByForeignLanguageId(int foreignLanguageId);
	
	List<ForeignLanguage> getByForeignLanguageNameAndLevel(String foreignLanguageName,int foreignLanguageLevel);

}
