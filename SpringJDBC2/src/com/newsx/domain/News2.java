package com.newsx.domain;

import java.io.Serializable;

public class News2 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String headlines;
	private String mainstory;
	private String videoURL;
	private String imageURL;
	private String NewsType;
	
	
	public String getNewsType() {
		return NewsType;
	}
	public void setNewsType(String newsType) {
		NewsType = newsType;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHeadlines() {
		return headlines;
	}
	public void setHeadlines(String headlines) {
		this.headlines = headlines;
	}
	public String getMainstory() {
		return mainstory;
	}
	public void setMainstory(String mainstory) {
		this.mainstory = mainstory;
	}
	public String getVideoURL() {
		return videoURL;
	}
	public void setVideoURL(String videoURL) {
		this.videoURL = videoURL;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	
	
	@Override
	public String toString() {
		return "News2 [id=" + id + ", headlines=" + headlines + ", mainstory="
				+ mainstory + ", videoURL=" + videoURL + ", imageURL="
				+ imageURL + ", NewsType=" + NewsType + "]";
	}
	
	
	

}
