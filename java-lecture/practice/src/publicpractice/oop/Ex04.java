package publicpractice.oop;

class Member08 {
	   private String id = "aaaaa";
	   private String name = "ȫ�浿";

	   Member08() {
	      // ���� Ŭ���� ���� �����ε� �� �ٸ� ������ ȣ��
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
	      System.out.println("���̵�:" + id + "�̸�:" + name);
	   }

	}

	public class Ex04 {

	   public static void main(String[] args) {
	      Member08 m = new Member08();
	      m.pr();
	      Member08 m2 = new Member08("bbbb");
	      m2.pr();
	      Member08 m3 = new Member08("cccccc", "������");
	      m3.pr();
	   }

	}
