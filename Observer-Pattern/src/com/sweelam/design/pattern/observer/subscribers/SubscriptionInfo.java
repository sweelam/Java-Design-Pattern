package com.sweelam.design.pattern.observer.subscribers;

public class SubscriptionInfo {
	// Domain structure
	private String articleName;
	private String autherName;
	private int validFor;

	private String content;

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public String getAutherName() {
		return autherName;
	}

	public void setAutherName(String autherName) {
		this.autherName = autherName;
	}

	public int getValidFor() {
		return validFor;
	}

	public void setValidFor(int validFor) {
		this.validFor = validFor;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
