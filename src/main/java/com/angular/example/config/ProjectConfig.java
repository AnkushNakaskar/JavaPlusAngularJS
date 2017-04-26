package com.angular.example.config;


//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.stereotype.Component;
//
//@Component
//@ConfigurationProperties(prefix = "project")
public class ProjectConfig {

	private String group;

	private String team;

	private String env;

	private String application;

	private Mail mail;

	private Slack slack;

	private Url url;

	private WebsocketConfig websocketConfig;

	private RabitConfig rabitConfig;
	
	private Message message;

	public static class RabitConfig {
		private String rabitHost;
		private String userName;
		private String password;
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getRabitHost() {
			return rabitHost;
		}
		public void setRabitHost(String rabitHost) {
			this.rabitHost = rabitHost;
		}
	}

	public static class WebsocketConfig {

		private String countUrl;

		public String getCountUrl() {
			return countUrl;
		}

		public void setCountUrl(String countUrl) {
			this.countUrl = countUrl;
		}
	}

	public static class Url {

		private String cms;

		public String getCms() {
			return cms;
		}

		public void setCms(String cms) {
			this.cms = cms;
		}

	}

	public static class Slack {

		private String hookUrl;

		public String getHookUrl() {
			return hookUrl;
		}

		public void setHookUrl(String hookUrl) {
			this.hookUrl = hookUrl;
		}

	}

	public static class Mail {

		private String from;

		private boolean enabled;

		public String getFrom() {
			return from;
		}

		public void setFrom(String from) {
			this.from = from;
		}

		public boolean isEnabled() {
			return enabled;
		}

		public void setEnabled(boolean enabled) {
			this.enabled = enabled;
		}

	}
	
	public static class Message {
		
		private String slackFile;
		
		private String uiFile;
		
		private String errorFile;

		public String getSlackFile() {
			return slackFile;
		}

		public void setSlackFile(String slackFile) {
			this.slackFile = slackFile;
		}

		public String getUiFile() {
			return uiFile;
		}

		public void setUiFile(String uiFile) {
			this.uiFile = uiFile;
		}

		public String getErrorFile() {
			return errorFile;
		}

		public void setErrorFile(String errorFile) {
			this.errorFile = errorFile;
		}
		
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getEnv() {
		return env;
	}

	public void setEnv(String env) {
		this.env = env;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public Mail getMail() {
		return mail;
	}

	public void setMail(Mail mail) {
		this.mail = mail;
	}

	public Url getUrl() {
		return url;
	}

	public void setUrl(Url url) {
		this.url = url;
	}

	public Slack getSlack() {
		return slack;
	}

	public void setSlack(Slack slack) {
		this.slack = slack;
	}

	public WebsocketConfig getWebsocketConfig() {
		return websocketConfig;
	}

	public void setWebsocketConfig(WebsocketConfig websocketConfig) {
		this.websocketConfig = websocketConfig;
	}

	public RabitConfig getRabitConfig() {
		return rabitConfig;
	}

	public void setRabitConfig(RabitConfig rabitConfig) {
		this.rabitConfig = rabitConfig;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
}
