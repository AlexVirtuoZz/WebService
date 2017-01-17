package model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
	//Method to proceed user request and return view page
	String execute (HttpServletRequest request, HttpServletResponse response);
}
