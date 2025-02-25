package com.absa.barclays.eBoxDB.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.absa.barclays.eBoxDB.entity.DB;

public interface DBRepository extends JpaRepository<DB, Integer>{
	public List<DB> findByTitleContainsOrDescriptionContainsIgnoreCase(String title, String description);

}
