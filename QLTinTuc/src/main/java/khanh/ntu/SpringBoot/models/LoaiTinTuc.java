package khanh.ntu.SpringBoot.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tintuc")
public class LoaiTinTuc {
	
	@Id
	@Column(name="id")
	int id;
	
	@Column(name="name")
	String name;

	public LoaiTinTuc() {
		super();
	}

	public LoaiTinTuc(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	
}
