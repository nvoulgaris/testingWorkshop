package com.nvoulgaris.testingworkshop.exercises.trip.trip;

import com.nvoulgaris.testingworkshop.exercises.trip.exception.UserNotLoggedInException;
import com.nvoulgaris.testingworkshop.exercises.trip.user.User;
import com.nvoulgaris.testingworkshop.exercises.trip.user.UserSession;
import java.util.ArrayList;
import java.util.List;

public class TripService {

  public List<Trip> getTripsByUser(User user) throws UserNotLoggedInException {
    List<Trip> tripList = new ArrayList<>();
    User loggedUser = UserSession.getInstance().getLoggedUser();
    boolean isFriend = false;
    if (loggedUser != null) {
      for (User friend : user.getFriends()) {
        if (friend.equals(loggedUser)) {
          isFriend = true;
          break;
        }
      }
      if (isFriend) {
        tripList = TripDAO.findTripsByUser(user);
      }
      return tripList;
    } else {
      throw new UserNotLoggedInException();
    }
  }
}
