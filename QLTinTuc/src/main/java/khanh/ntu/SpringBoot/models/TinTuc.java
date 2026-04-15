package khanh.ntu.SpringBoot.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tintuc")
public class TinTuc {

	@Id
	@Column(name="id")
	int id;
	
	@Column(name="name")
	String name;
	
	@Column(name="context")
	String content;
	
	@Column(name="loai")
	int loaiTT;

	public TinTuc() {
		super();
	}

	public TinTuc(int id, String name, String content, int loaiTT) {
		super();
		this.id = id;
		this.name = name;
		this.content = content;
		this.loaiTT = loaiTT;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getLoaiTT() {
		return loaiTT;
	}

	public void setLoaiTT(int loaiTT) {
		this.loaiTT = loaiTT;
	}
	
	
}
