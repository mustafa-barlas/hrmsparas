package parasorsio.Hrms.core.utilities.result;

public class Result {

	private boolean success;
	private String message;
	
	public Result(boolean success) {
		this.success = success;
		
	}
	
    public Result(boolean success, String mesage) {
    	this(success);
    	this.message = mesage;
    	
	}
    
    public boolean isSuccess() {
    	
    	return this.success;
    }
    
    public String getMessage() {
    	
    	return this.message;
    }
}
