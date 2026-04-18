package khanh.ntu.SpringBoot.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tintuc")
public class TinTuc {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	Integer id;
	
	@Column(name="name")
	String name;
	
	@Column(name="content", columnDefinition = "TEXT")
	String content;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="loai")
	LoaiTinTuc loaiTT;

	public TinTuc() {
		super();
	}

	public TinTuc(int id, String name, String content, LoaiTinTuc loaiTT) {
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

	public LoaiTinTuc getLoaiTT() {
		return loaiTT;
	}

	public void setLoaiTT(LoaiTinTuc loaiTT) {
		this.loaiTT = loaiTT;
	}
	
	
}
