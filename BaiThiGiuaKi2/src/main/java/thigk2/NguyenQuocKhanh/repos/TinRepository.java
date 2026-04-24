package thigk2.NguyenQuocKhanh.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import thigk2.NguyenQuocKhanh.models.Tin;

@Repository
public interface TinRepository extends JpaRepository<Tin, Integer> {
	List<Tin> findByTheLoaiTinId(Integer theLoaiId);
}
