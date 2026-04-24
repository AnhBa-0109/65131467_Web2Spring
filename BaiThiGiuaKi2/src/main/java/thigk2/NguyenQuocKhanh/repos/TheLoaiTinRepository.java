package thigk2.NguyenQuocKhanh.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import thigk2.NguyenQuocKhanh.models.TheLoaiTin;

@Repository
public interface TheLoaiTinRepository extends JpaRepository<TheLoaiTin, Integer>{

}
