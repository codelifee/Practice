package publicpractice.oop;

class Member08 {
	   private String id = "aaaaa";
	   private String name = "홍길동";

	   Member08() {
	      // 같은 클래스 내의 오버로딩 된 다른 생성자 호출
	   }

	   Member08(String id) {
	      this.id = id;
	   }

	   public Member08(String id, String name) {
	      // TODO Auto-generated constructor stub
	      this.id = id;
	      this.name = name;
	   }

	   public void pr() {
	      System.out.println("아이디:" + id + "이름:" + name);
	   }

	}

	public class Ex04 {

	   public static void main(String[] args) {
	      Member08 m = new Member08();
	      m.pr();
	      Member08 m2 = new Member08("bbbb");
	      m2.pr();
	      Member08 m3 = new Member08("cccccc", "강감찬");
	      m3.pr();
	   }

	}
