package com.nvoulgaris.testingworkshop.exercises.interaction;

public class UserUpdateUseCase {

  private UserRepository repository;
  private UserUpdateService service;

  public UserUpdateUseCase(UserRepository repository, UserUpdateService service) {
    this.repository = repository;
    this.service = service;
  }

  public User process(UserUpdateEvent event) {
    if (event.getId() == null) {
      throw new RuntimeException("Received an empty user event");
    }

    try {
      User user = repository.findById(event.getId());
      User updatedUser = service.update(user, event);
      User savedUser = repository.save(updatedUser);
      return savedUser;
    } catch (Exception e) {
      throw new RuntimeException("Failed to update user. Aborting operation", e);
    }
  }
}
