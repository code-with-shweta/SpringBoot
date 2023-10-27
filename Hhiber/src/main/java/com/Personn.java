package com;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Id;

import jakarta.persistence.Persistence;

@Entity
public class Personn { 
	
@Id
int id;
String name;
int age;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String anme) {
	this.name = anme;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("hello");
	EntityManager em=emf.createEntityManager();
    EntityTransaction et=em.getTransaction();
    
    Personn p=new Personn();
    p.setAge(30);
    p.setName("avi");
    p.setId(2);
    
    
    et.begin();
    em.persist(p);
    et.commit();
    
}

}
