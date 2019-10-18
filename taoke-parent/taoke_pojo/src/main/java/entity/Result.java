package entity;

import java.io.Serializable;

public class Result implements Serializable {

	private boolean success;
	private String message;
	private Object data;

    public Result() {

    }
    public Result(Object data) {
        this.data = data;
    }
    public Result(boolean success, Object data) {
        this(data);
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Result [success=" + success + ", message=" + message + "]";
	}
	public Result(boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}

}
