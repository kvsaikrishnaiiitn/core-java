import java.util.Arrays;
import java.util.List;

public class EmployeeCountCheck {

	public static void main(String[] args) {

		List<Employee> empList = Arrays.asList(new Employee(1, "emp1", 100, "dep1"), new Employee(2, "emp2", 200, "dep2"), new Employee(3, "emp3", 300, "dep1"),
				new Employee(4, "emp4", 400, "dep3"));

		Long empWithDepAsDep1Count = empList.stream().filter(e -> e.getDepartment().equals("dep1")).count();
		System.out.println(empWithDepAsDep1Count);

	}

}
