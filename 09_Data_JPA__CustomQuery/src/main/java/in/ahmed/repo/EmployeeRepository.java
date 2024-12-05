package in.ahmed.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import in.ahmed.entity.Employee;
import jakarta.transaction.Transactional;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	@Query("From Employee")
	public List<Employee> getAllUsers();

	/*
	 * @Transactional
	 * 
	 * @Modifying
	 * 
	 * @Query("insert into Employee (id,name,salary,country) values(:id,:name,:salary,:country)"
	 * ) public void saveUserHql(Integer id, String name, Double salary, String
	 * country);
	 */
	/*
	 * @Query("FROM Employee WHERE country = :country") public List<Employee>
	 * getUsaEmp(@Param("country") String country);
	 */
	/*
	 * @Query("Select u From Employee u Where u.name =:n and u.country =:c") public
	 * List<Employee> getByNameAndCountry(@Param("n") String name, @Param("c")
	 * String country);
	 */
	/*
	 * @Query(value = "select * from New_Employee ", nativeQuery = true) public
	 * List<Employee> getByNativeSql();
	 */
	
	@Transactional
	@Modifying
	@Query(value="Insert Into Employee(id,name,salary,country)values(:id,:name,:salary,:country)")
	public void saveUserHql(List<Employee> asList);
}
