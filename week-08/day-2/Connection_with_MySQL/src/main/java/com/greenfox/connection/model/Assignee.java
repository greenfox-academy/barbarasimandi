package com.greenfox.connection.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Assignee {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;

  String eMail;
  String name;

  @OneToMany(fetch = FetchType.EAGER)
  List<Todo> todos;


  public Assignee(String eMail, String name) {
    this.eMail = eMail;
    this.name = name;
  }

  public Assignee() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String geteMail() {
    return eMail;
  }

  public void seteMail(String eMail) {
    this.eMail = eMail;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Todo> getTodos() {
    return todos;
  }

  public void setTodos(List<Todo> todos) {
    this.todos = todos;
  }

}