package com.jacklab.sb01.bean;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/*
 * @ConfigurationProperties starts to read from global then customized properties
 */
@Component
@ConfigurationProperties(prefix="onlineGame")
@PropertySource(value= {"classpath:onlineGameProp.properties"})
public class OnlineGame {

	private String gameName;
	private Integer gameID;
	private Boolean isActive;
	private Date issueDate;
	
	private Map<String, Object> params;
	private List<Object> encore;
	private User user;
	
	
	public String getGameName() {
		return gameName;
	}


	public void setGameName(String gameName) {
		this.gameName = gameName;
	}


	public Integer getGameID() {
		return gameID;
	}


	public void setGameID(Integer gameID) {
		this.gameID = gameID;
	}


	public Boolean getIsActive() {
		return isActive;
	}


	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}


	public Date getIssueDate() {
		return issueDate;
	}


	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}


	public Map<String, Object> getParams() {
		return params;
	}


	public void setParams(Map<String, Object> params) {
		this.params = params;
	}


	public List<Object> getEncore() {
		return encore;
	}


	public void setEncore(List<Object> encore) {
		this.encore = encore;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "OnlineGame [gameName=" + gameName + ", gameID=" + gameID + ", isActive=" + isActive + ", issueDate="
				+ issueDate + ", params=" + params + ", encore=" + encore + ", user=" + user + "]";
	}
	
	
	
}
