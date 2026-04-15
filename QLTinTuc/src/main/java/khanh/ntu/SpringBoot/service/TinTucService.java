package khanh.ntu.SpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import khanh.ntu.SpringBoot.models.LoaiTinTuc;
import khanh.ntu.SpringBoot.models.TinTuc;
import khanh.ntu.SpringBoot.repos.LoaiTinTucRepository;
import khanh.ntu.SpringBoot.repos.TinTucRepository;

@Service
public class TinTucService {
	
	@Autowired
	TinTucRepository tintucRepos;
	
	@Autowired
	LoaiTinTucRepository loaiRepos;
	
	public List<TinTuc> getAllTinTuc()
	{
		return tintucRepos.findAll();
	}
	
	public List<LoaiTinTuc> getAllLoai()
	{
		return loaiRepos.findAll();
	}
	public void saveTinTuc(String name, String content, LoaiTinTuc loai)
	{
		TinTuc tintuc = new TinTuc();
		tintuc.setName(name);
		tintuc.setContent(content);
		tintuc.setLoaiTT(loai);
		
		tintucRepos.save(tintuc);
	}
}
