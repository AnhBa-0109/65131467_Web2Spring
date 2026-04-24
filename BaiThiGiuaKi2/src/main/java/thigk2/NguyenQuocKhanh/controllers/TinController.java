package thigk2.NguyenQuocKhanh.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import thigk2.NguyenQuocKhanh.models.TheLoaiTin;
import thigk2.NguyenQuocKhanh.models.Tin;
import thigk2.NguyenQuocKhanh.repos.TheLoaiTinRepository;
import thigk2.NguyenQuocKhanh.repos.TinRepository;

@RestController

public class TinController {
	@Autowired
    private TheLoaiTinRepository theLoaiTinRepository;

    @Autowired
    private TinRepository tinRepository;

    @GetMapping("/api/theloai")
    public List<TheLoaiTin> getAllTheLoai() {
        return theLoaiTinRepository.findAll();
    }

    @GetMapping("/api/tin/theloai/{id}")
    public List<Tin> getTinByTheLoai(@PathVariable("id") Integer id) {
        return tinRepository.findByTheLoaiTinId(id);
    }
}
