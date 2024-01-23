package POLYGLOT.MS.TEST.Security.model;

import java.io.Serializable;

import org.bson.codecs.pojo.annotations.BsonId;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Document(collection = "access")
public class AccessModel implements Serializable{
	private static final long serialVersionUID = 1L;
	@BsonId
    private String id_user;    

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;
    
    @Override
	public String toString() {
		return "AccessModel [id_user=" + id_user + ", username=" + username + ", password=" + password + "]";
	}

	public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
