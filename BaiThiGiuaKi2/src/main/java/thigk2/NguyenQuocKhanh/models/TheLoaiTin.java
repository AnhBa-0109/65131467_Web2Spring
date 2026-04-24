package thigk2.NguyenQuocKhanh.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "theloaitin")
public class TheLoaiTin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String ten;

    @OneToMany(mappedBy = "theLoaiTin", cascade = CascadeType.ALL)
    private List<Tin> dsTin;

	public TheLoaiTin(Integer id, String ten, List<Tin> dsTin) {
		super();
		this.id = id;
		this.ten = ten;
		this.dsTin = dsTin;
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

	public List<Tin> getDsTin() {
		return dsTin;
	}

	public void setDsTin(List<Tin> dsTin) {
		this.dsTin = dsTin;
	}

    
}
