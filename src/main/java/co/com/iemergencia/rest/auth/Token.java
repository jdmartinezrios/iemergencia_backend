package co.com.iemergencia.rest.auth;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 *
 * @author Juan David Martinez
 */
public class Token {

    String token;

    public Token(@JsonProperty("token") String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}