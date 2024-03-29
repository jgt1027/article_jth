package jth.acticle;

public class Article {
	String articleId;
	String userId;
	String name;
	String udate;
	String cdate;
	String content;
	String title;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArticleId() {
		return articleId;
	}
	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return	name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUdate() {
		return udate;
	}
	public void setUdate(String udate) {
		this.udate = udate;
	}
	public String getCdate() {
		return cdate;
	}
	public void setCdate(String cdate) {
		this.cdate = cdate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "Article [articleId=" + articleId + ", userId=" + userId + ", name=" + name + ", udate=" + udate
				+ ", cdate=" + cdate + ", content=" + content + ", title=" + title + "]";
	}
	
	
}
