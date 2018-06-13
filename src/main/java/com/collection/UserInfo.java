package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
@Table(name="user_list")
public class UserInfo
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
  private int id;
	@Column
  private String name;
	@ElementCollection
	   @CollectionTable(name="Nicknames", joinColumns=@JoinColumn(name="user_id"))
	   @Column(name="nickname")
	private List<String> nickNames;
	
 
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
public List<String> getNickNames() {
	return nickNames;
}
public void setNickNames(List<String> nickNames) {
	this.nickNames = nickNames;
}
@Override
public String toString() {
	return "UserInfo [id=" + id + ", name=" + name + ", nickNames=" + nickNames + "]";
}



}
