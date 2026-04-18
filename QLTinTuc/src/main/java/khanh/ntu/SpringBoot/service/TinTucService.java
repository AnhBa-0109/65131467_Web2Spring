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
	
	
	public TinTuc getTinTuc(int id)
	{
		return tintucRepos.getReferenceById(id);
	}
	
	public void saveTinTuc(TinTuc tintuc)
	{
		tintucRepos.save(tintuc);
	}
	public void saveLoai(LoaiTinTuc loai)
	{
		loaiRepos.save(loai);
	}
	public void deleteTinTuc(int id)
	{
		for(TinTuc t : tintucRepos.findAll())
		{
			if(t.getId() == id) tintucRepos.delete(t);
		}
	}
}
