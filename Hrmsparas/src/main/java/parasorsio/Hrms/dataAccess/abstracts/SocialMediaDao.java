package parasorsio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import parasorsio.Hrms.entities.concretes.SocialMedia;

public interface SocialMediaDao extends JpaRepository<SocialMedia, Integer> {

	SocialMedia getBySocialMediaId(int socialMediaId);

	SocialMedia getBySocialMediaName(String socialMediName);
}
