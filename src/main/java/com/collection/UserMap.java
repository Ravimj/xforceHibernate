package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="user_map")
public class UserMap
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
  private int id;
	@Column
  private String name;
	@ElementCollection
	   @CollectionTable(name="Qr_Codes", joinColumns=@JoinColumn(name="user_id"))
	   @Column(name="qrCode")
	private Map<Integer,String> qrCodes;
	
 

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


public Map<Integer, String> getQrCodes() {
	return qrCodes;
}
public void setQrCodes(Map<Integer, String> qrCodes) {
	this.qrCodes = qrCodes;
}
@Override
public String toString() {
	return "UserMap [id=" + id + ", name=" + name + ", qrCodes=" + qrCodes + "]";
}



}
