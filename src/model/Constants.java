package model;

public interface Constants {
	String LOGIN = "login";
	String PASSWORD = "password";
	String LOGIN_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{6,12}$";
	String PASSWORD_REGEX_WRONG = ".*\\d{4,}.*|.*[a-z]{4,}.*|.*(.)\\1{3,}.*";
	
	String ERROR_LOGIN_PASSWORD = "logPassError";
	String ERROR_LOGIN_TAKEN = "loginTaken";
	String REGISTRATION_SUCCEED = "regSucceed";
	
	String PAGE_SUCCESS = "/WEB-INF/success.html";
	String PAGE_LOGIN = "index.jsp";
	String PAGE_REGISTER = "registration.jsp";
	
	String CHARSET = "US-ASCII";
}
