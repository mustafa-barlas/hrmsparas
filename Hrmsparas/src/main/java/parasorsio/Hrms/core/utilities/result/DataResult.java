package parasorsio.Hrms.core.utilities.result;

public class DataResult<T> extends Result {

	
	private T data;
	
	public DataResult(T data, boolean success, String mesage) {
		super(success, mesage);
		this.data = data;
	}

	public DataResult(T data, boolean success) {
		super(success);
		this.data = data;
	}
	
	public T getData(T data) {
		
		return this.data;
	}
	
}
