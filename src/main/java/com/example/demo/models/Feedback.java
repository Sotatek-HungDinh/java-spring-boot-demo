package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "feedback")
public class Feedback {
  @Id
  private int id;
  private String name;
  private String description;
  private String status;
  private String file;

  public Feedback(){
    super();
  }

  // cái này không gán thẳng được nên muốn lấy ra thì sẽ phải dùng hàm getter, setter

  // vd: muốn lấy trường description -> getDescripton()
  // muốn update description -> setDescription(String description)
  public String getDescription() {
    return description;
  }

  public String getFile() {
    return file;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getStatus() {
    return status;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setFile(String file) {
    this.file = file;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
