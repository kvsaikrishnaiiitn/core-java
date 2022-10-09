import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFilterAndNameToUppercase {

	public static void main(String[] args) {

		List<Employee> empList = Arrays.asList(new Employee(1, "name1", 100, "it", "active"),
				new Employee(2, "name2", 200, "it", "inactive"), new Employee(3, "name3", 300, "admin", "active"));

		/*
		 * Function<Employee, Employee> nameToUpperCase = e -> {
		 * e.setName(e.getName().toUpperCase()); return e; };
		 */

		List<Employee> modifiedList = empList.stream().filter(e -> e.getSalary() > 100)
				.filter(e -> e.getDepartment().equals("admin")).map(e -> {
					e.setName(e.getName().toUpperCase());
					return e;
				}).collect(Collectors.toList());

		System.out.println(modifiedList);
	}

}
