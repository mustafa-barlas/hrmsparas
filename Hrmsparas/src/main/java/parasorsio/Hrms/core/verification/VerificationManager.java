package parasorsio.Hrms.core.verification;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public  class VerificationManager implements VerificationService {

	@Override
	public void sendLink(String email) {
		UUID uuid = UUID.randomUUID();
		String verificationLink = "https://hrmsparasverificationemail/"+uuid.toString();
		System.out.println(" dogrulama linki gönderildi "+email);
		System.out.println(" lütfen dogrulama linkini  tıklayın "+verificationLink);
	}
		
	

	@Override
	public String sendCode() {
		
		UUID uuid = UUID.randomUUID();
		String verificationCode = uuid.toString();
		System.out.println(" aktivasyon kodunuz "+verificationCode);
		return verificationCode;
	}

	
}
