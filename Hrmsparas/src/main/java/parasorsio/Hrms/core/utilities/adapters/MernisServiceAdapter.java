package parasorsio.Hrms.core.utilities.adapters;

import org.springframework.stereotype.Service;

import parasorsio.Hrms.mernisService.FakeMernis;

@Service
public class MernisServiceAdapter implements ValidationService {

	@Override
	public boolean validateByMernis(String firstName, String lastName) {
		 
		FakeMernis client = new FakeMernis();
		
		boolean result = true;
		
		try {
			
			result = client.ValidateMernisFake(firstName, lastName);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
