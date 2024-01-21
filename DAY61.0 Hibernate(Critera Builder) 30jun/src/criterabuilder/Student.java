package criterabuilder;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

@Id	
private int rollno;
private String name;

public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

	
}
