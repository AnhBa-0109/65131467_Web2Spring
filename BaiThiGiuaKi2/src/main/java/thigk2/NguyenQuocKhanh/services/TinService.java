package thigk2.NguyenQuocKhanh.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thigk2.NguyenQuocKhanh.models.TheLoaiTin;
import thigk2.NguyenQuocKhanh.models.Tin;
import thigk2.NguyenQuocKhanh.repos.NguoiDungRepository;
import thigk2.NguyenQuocKhanh.repos.TheLoaiTinRepository;
import thigk2.NguyenQuocKhanh.repos.TinRepository;

@Service
public class TinService {
	
	@Autowired
	TinRepository tinRepo;
	
	@Autowired
	TheLoaiTinRepository theloaiRepo;
	
	@Autowired
	NguoiDungRepository userRepo;
	
	public List<Tin> getAllTin()
	{
		return tinRepo.findAll();
	}
	
	public List<TheLoaiTin> getAllTheLoai()
	{
		return theloaiRepo.findAll();
	}
	
	public Tin getById(int id)
	{
		return tinRepo.getReferenceById(id);
	}
	
}
