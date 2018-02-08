package rmuti.lab04.lab5;

public class TestArrayListPQ {

	public static void main(String[] args) {
		Employee emp1 = new Employee("001", "name1", 20_000);
		Employee emp2 = new Employee("002", "name2", 30_000);
		Employee emp3 = new Employee("003", "name3", 15_000);
	
		ArrayListPQ arrayLisPQ = new ArrayListPQ();
		arrayLisPQ.enqueue(emp1);
		arrayLisPQ.enqueue(emp2);
		arrayLisPQ.enqueue(emp3);
		
		System.out.println(arrayLisPQ);
		
		arrayLisPQ.dequeue();
		System.out.println(arrayLisPQ);
		
		arrayLisPQ.dequeue();
		System.out.println(arrayLisPQ);
		
		arrayLisPQ.enqueue(new Employee("004", "name4", 40_000));
		System.out.println(arrayLisPQ);
	}
	
}