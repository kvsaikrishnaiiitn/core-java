import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class EmployeeByDepartment {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "emp1", 10000, "dept1");
		Employee e2 = new Employee(2, "emp2", 20000, "dept1", "inactive");
		Employee e3 = new Employee(3, "emp3", 40000, "dept2", "inactive");
		Employee e4 = new Employee(4, "emp4", 50000, "dept2");
		Employee e5 = new Employee(5, "emp5", 60000, "dept3", "inactive");

		List<Employee> empList = Arrays.asList(e1, e2, e3, e4, e5);

		// Employees in each department

		Map<String, List<Employee>> employeeListByEachDept = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toList()));

		employeeListByEachDept.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + "->" + entry.getValue());
		});

		System.out.println("------------------");

		// Count of employees in each department

		Map<String, Long> eachDeptCount = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

		eachDeptCount.entrySet().forEach(e -> {
			System.out.println(e.getKey() + "->" + e.getValue());
		});

		System.out.println("------------------");

		// Max, Min salary employees

		Optional<Employee> maxSalaryEmployee = empList.stream().max(Comparator.comparing(Employee::getSalary));
		Optional<Employee> minSalaryEmployee = empList.stream().min(Comparator.comparing(Employee::getSalary));

		System.out.println(maxSalaryEmployee);
		System.out.println(minSalaryEmployee);

		System.out.println("------------------");

		// Active/inactive employees count list

		Long activeCount = empList.stream().filter(e -> "active".equals(e.getStatus())).count();
		Long inActiveCount = empList.stream().filter(e -> "inactive".equalsIgnoreCase(e.getStatus())).count();

		System.out.println(activeCount);
		System.out.println(inActiveCount);

		System.out.println("------------------");

		// Max salary of each Department

		Map<String, Optional<Employee>> maxSalaryEmployeeByEachDept = empList.stream()
				.filter(e -> e.getStatus().equals("active")).collect(Collectors.groupingBy(Employee::getDepartment,
						Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));

		maxSalaryEmployeeByEachDept.entrySet().forEach(e -> System.out.println(e.getKey() + "->" + e.getValue()));

	}
}
