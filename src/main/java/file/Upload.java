package file;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Upload implements java.io.Serializable {
	@Id
	@GeneratedValue
	@Column(name = "cloId")
	private Integer fileID;
	
	@Column
	private String fileName;
	@Column
	private String description;
	@Column
	Date fileCreated;
	
	void upload(){
	}
	
	public Date getFileCreated() {
		return fileCreated;
	}

	public void setFileCreated() {
		this.fileCreated = new java.sql.Date(System.currentTimeMillis());
	}

	void upload(String f, String d){
		this.fileName = f;
		this.description = d;
	}


	public String getFileName() {
		return fileName;
	}


	public void setFileName(String fileName) {
		this.fileName = fileName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
}