package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Ex01 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(5);
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		
		// �����ϴ� �޼ҵ� Collections.sort()
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		// containsAll�� booleanŸ���� ����� ��ȯ
		System.out.println("list1.containsAll(list2): " + list1.containsAll(list2));
		System.out.println();
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A"); // ���� ��ҵ��� �з���(�۾��� ���ϰ� ����)
		print(list1, list2);
		
		list2.set(3, "AA"); // 3�� �ε����� ��Ҹ� "AA"�� ġȯ
		print(list1, list2);
		
		list1.add(0, "1");
		print(list1, list2);
		System.out.println("index= " + list1.indexOf(new Integer(1))); // indexOf�� ����� ������ Ÿ���� �ν�
		System.out.println();
		
		list1.remove(new Integer(1)); // Integer 1�� ������
		// list1.remove(1) -> �̰��� 1�� �����ϴ� ���� �ƴ϶�, �ε��� 1�� ��Ҹ� �������� �ǹ�
		print(list1, list2);
		
		// list2�� �ߺ��� ��ҵ��� list1���� ����(������)
		System.out.println("list1.retainAll(list2): " + list1.retainAll(list2));
		print(list1, list2);
		
		// list1�� ��ҿ� ���Ե� ��Ұ� list2�� ���� ���, �ش� ��� ����
		// �ڿ������� �����ϴ� ����,,, �տ��� �����ϸ� �ε����� ������ �߻�!!
		for (int i=list1.size()-1; i>=0; i--) {
			if (list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		print(list1, list2);
		
		System.out.println(list2.size());
	}

	// ���� list1, list2�� ������ �����ֱ� ���� �޼ҵ� �ۼ�
	public static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		System.out.println();
	}
}