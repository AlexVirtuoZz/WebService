package model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Account;
import model.service.AccountService;
/*
 * Command to proceed user login
 */
public class LoginCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		AccountService accountService = AccountService.getInstance();
		String login = (String) request.getParameter(Constants.LOGIN);
		String password = (String) request.getParameter(Constants.PASSWORD);
		
		Account tmp = accountService.read(new Account(login, password));
		
		if (tmp != null && login.equalsIgnoreCase(tmp.getLogin()) && password.equals(tmp.getPassword()))
			return Constants.PAGE_SUCCESS;		
		
		request.setAttribute(Constants.ERROR_LOGIN_PASSWORD, true);
		return Constants.PAGE_LOGIN;
	}

}
