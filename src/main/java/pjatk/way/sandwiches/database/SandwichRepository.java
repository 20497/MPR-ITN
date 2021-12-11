package pjatk.way.sandwiches.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import pjatk.way.sandwiches.model.SandwichModel;

public interface SandwichRepository extends JpaRepository<SandwichModel, Integer> {

}
