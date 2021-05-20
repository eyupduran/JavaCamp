package kodlama.io.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jobPositions")
public class JobPosition {
	@Id
	@GeneratedValue
	@Column(name ="id")
   private int id;
	@Column(name ="name")
   private String name;
   @Column(name ="createDate")
   private Date createDate;
   
   public JobPosition() {}

public JobPosition(int id, String name, Date createDate) {
	super();
	this.id = id;
	this.name = name;
	this.createDate = createDate;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Date getCreateDate() {
	return createDate;
}

public void setCreateDate(Date createDate) {
	this.createDate = createDate;
}
   
	
	
}
