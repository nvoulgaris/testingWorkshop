package com.nvoulgaris.testingworkshop.exercises.trip.trip;

import com.nvoulgaris.testingworkshop.exercises.trip.exception.CollaboratorCallException;
import com.nvoulgaris.testingworkshop.exercises.trip.user.User;
import java.util.List;

public class TripDAO {

  public static List<Trip> findTripsByUser(User user) {
    throw new CollaboratorCallException(
        "TripDAO should not be invoked on an unit test.");
  }
}
