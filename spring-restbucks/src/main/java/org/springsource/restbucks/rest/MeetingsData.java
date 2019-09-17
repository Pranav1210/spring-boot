package org.springsource.restbucks.rest;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springsource.restbucks.model.Meetings;

@RestController
@RequestMapping(value = "/meetings")
public class MeetingsData {
	@RequestMapping(value = "/{meetingId}", method = RequestMethod.GET)
	public Meetings getMeeting(@PathVariable Long meetingId) {
		String[] toppings = {"Cheese", "Pepperoni", "Black Olives"};
		Meetings m = new Meetings();
		m.setParticipants(toppings);
		return m;
	}
}
