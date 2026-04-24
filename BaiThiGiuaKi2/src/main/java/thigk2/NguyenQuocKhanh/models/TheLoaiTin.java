package thigk2.NguyenQuocKhanh.models;

import jakarta.persistence.*;

@Entity
@Table(name = "theloaitin")
public class TheLoaiTin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String ten;


	public TheLoaiTin(Integer id, String ten) {
		super();
		this.id = id;
		this.ten = ten;
	}

	public TheLoaiTin() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

    
}
