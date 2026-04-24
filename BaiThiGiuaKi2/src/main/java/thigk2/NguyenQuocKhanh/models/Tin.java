package thigk2.NguyenQuocKhanh.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Tin")
public class Tin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String ten;

    @Column(columnDefinition = "TEXT")
    private String content;

    @ManyToOne
    @JoinColumn(name = "theloai_id")
    private TheLoaiTin theLoaiTin;

	public Tin(Integer id, String ten, String content, TheLoaiTin theLoaiTin) {
		super();
		this.id = id;
		this.ten = ten;
		this.content = content;
		this.theLoaiTin = theLoaiTin;
	}

	public Tin() {
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public TheLoaiTin getTheLoaiTin() {
		return theLoaiTin;
	}

	public void setTheLoaiTin(TheLoaiTin theLoaiTin) {
		this.theLoaiTin = theLoaiTin;
	}

    
}
