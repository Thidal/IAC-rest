package main.domain;

/**
 * Created by Jaron Koelewijn on 26/03/2017.
 */
public class ErrorResponse {
    private int errorcode;
    private String errordesc;

    public ErrorResponse(int errorcode, String errordesc) {
        this.errorcode = errorcode;
        this.errordesc = errordesc;
    }

    public int getErrorcode() {
        return errorcode;
    }

    public void setErrorcode(int errorcode) {
        this.errorcode = errorcode;
    }

    public String getErrordesc() {
        return errordesc;
    }

    public void setErrordesc(String errordesc) {
        this.errordesc = errordesc;
    }
}
