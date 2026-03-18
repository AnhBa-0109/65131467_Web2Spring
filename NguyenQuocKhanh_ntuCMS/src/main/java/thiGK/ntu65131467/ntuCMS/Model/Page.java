package thiGK.ntu65131467.ntuCMS.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="page")
public class Page {
	
	@Id
	@Column(name="id")
	int id;
	
	@Column(name="pageName")
	String pageName;
	
	@Column(name="keyword")
	String keyWord;
	
	@Column(name="content")
	String Content;
	
	@Column(name="parentPageId")
	int parentPageId;

	public Page(int id, String pageName, String keyWord, String content, int parentPageId) {
		super();
		this.id = id;
		this.pageName = pageName;
		this.keyWord = keyWord;
		Content = content;
		this.parentPageId = parentPageId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public String getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public int getParentPageId() {
		return parentPageId;
	}

	public void setParentPageId(int parentPageId) {
		this.parentPageId = parentPageId;
	}
	
	
}
