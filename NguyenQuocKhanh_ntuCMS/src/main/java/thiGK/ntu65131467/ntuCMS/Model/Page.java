package thiGK.ntu65131467.ntuCMS.Model;

public class Page {
	String id;
	String pageName;
	String keyWord;
	String Content;
	int parentPageId;
	public Page(String id, String pageName, String keyWord, String content, int parentPageId) {
		this.id = id;
		this.pageName = pageName;
		this.keyWord = keyWord;
		this.Content = content;
		this.parentPageId = parentPageId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
