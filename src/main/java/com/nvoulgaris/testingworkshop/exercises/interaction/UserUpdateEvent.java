package com.nvoulgaris.testingworkshop.exercises.interaction;

public class UserUpdateEvent {

  private String id;

  public UserUpdateEvent(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
