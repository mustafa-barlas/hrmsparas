package parasorsio.Hrms.core.verification;

public interface VerificationService {
	void sendLink(String email);
	String sendCode();
}
