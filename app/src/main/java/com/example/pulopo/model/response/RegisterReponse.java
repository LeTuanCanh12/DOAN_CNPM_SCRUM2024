
package com.example.pulopo.model.response;
import java.util.List;

public class RegisterReponse {
    private DataLoginUser data;
    private boolean success;
    private String message;

    public DataLoginUser getData() { return data; }
    public void setData(DataLoginUser value) { this.data = value; }

    public boolean getSuccess() { return success; }
    public void setSuccess(boolean value) { this.success = value; }

    public String getMessage() { return message; }
    public void setMessage(String value) { this.message = value; }
}
