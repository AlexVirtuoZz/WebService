package model;

import java.util.regex.Matcher;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Account;
import model.service.AccountService;
/*
 * Command to register user in database
 */
public class RegisterCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String login = (String) request.getParameter(Constants.LOGIN);
		String password = (String) request.getParameter(Constants.PASSWORD);
		if (verifyLogin(login) && verifyPassword(password)){
			AccountService accountService = AccountService.getInstance();
			Account tmp = new Account(login, password);
			if (accountService.read(tmp) == null){
				accountService.create(tmp);
				request.setAttribute(Constants.REGISTRATION_SUCCEED, true);
				return Constants.PAGE_REGISTER;
			} else {
				request.setAttribute(Constants.ERROR_LOGIN_TAKEN, true);
			}
		}else {
			request.setAttribute(Constants.ERROR_LOGIN_PASSWORD, true);
		}		
		return Constants.PAGE_REGISTER;
	}
	/*
	 * A method to verify user login	
	 */
	private boolean verifyLogin(String login){
		Pattern p = Pattern.compile(Constants.LOGIN_REGEX);
		Matcher m = p.matcher(login);
		return m.matches();		
	}
	/*
	 * A method to verify user password
	 */
	private boolean verifyPassword(String password){
		Pattern p = Pattern.compile(Constants.PASSWORD_REGEX_WRONG);
		Matcher m = p.matcher(password);
		
		if (m.matches())
			return false;
		
		p = Pattern.compile(Constants.PASSWORD_REGEX);
		m = p.matcher(password);
		CharsetEncoder asciiEncoder = Charset.forName(Constants.CHARSET).newEncoder();

		return (m.matches() && asciiEncoder.canEncode(password));

	}
}

