package thiGK.ntu65131467.ntuCMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import thiGK.ntu65131467.ntuCMS.Model.Post;


@Repository
public interface PostRepository extends JpaRepository<Post, Integer>{

}
