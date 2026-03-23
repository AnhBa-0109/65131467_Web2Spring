package thiGK.ntu65131467.ntuCMS.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="post")
public class Post {
	
	@Id
	@Column(name="id")
	int id;
	
	@Column(name="title")
	String title;
	
	@Column(name="content")
	String Content;
	
	@Column(name="categoryid")
	int categoryId;
	
	public Post() {};
	public Post(int id, String title, String content, int categoryId) {
		this.id = id;
		this.title = title;
		this.Content = content;
		this.categoryId = categoryId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	
}
