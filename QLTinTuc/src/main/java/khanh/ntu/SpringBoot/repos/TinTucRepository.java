package khanh.ntu.SpringBoot.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import khanh.ntu.SpringBoot.models.TinTuc;

public interface TinTucRepository extends JpaRepository<TinTuc, Integer> {

}
