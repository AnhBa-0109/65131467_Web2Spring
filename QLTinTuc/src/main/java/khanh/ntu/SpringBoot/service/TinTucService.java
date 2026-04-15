package khanh.ntu.SpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
