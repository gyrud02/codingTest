package codingtest.ct.week02;

import java.util.HashSet;
import java.util.Set;

public class Ex0208 {

	public static void main(String[] args) {

		// 4. 셋(Set)
		// - List 컬렉션은 저장 순서를 유지하지만 Set 컬렉션은 저장순서가 유지되지 않는다.
		// - 객체를 중복 저장할 수 없고, 하나의 NULL만 저장할 수 있다.
		// - add(index, endindex) 사용불가: 인덱스가 없기 때문에
		// - set 메소드도 따로 없다. 값을 중복으로 저장할 수 없기 때문에 add로 처리한다.
		
		Set<Member> set = new HashSet<>();
		
		set.add(new Member("홍길동", 30));
//		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 20));
		
		System.out.println(set.size());
		
		Member member1 = new Member("가나다", 30);
		Member member2 = new Member("가나다", 30);
		Member member3 = member2;
		
		System.out.println(member1.hashCode());
		System.out.println(member2.hashCode());
		System.out.println(member3.hashCode());
	}
}

class Member{
	
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && member.age == age;
		}else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}

}