package jdbc;


import java.util.Iterator;
import java.util.List;

import net.abc.dao.GuDAOImpl;
import net.abc.vo.GuVO;

public class Gu_List02 {

	public static void main(String[] args) {
		GuDAOImpl gdao=new GuDAOImpl();
				
		List<GuVO> glist=gdao.getGuList();
		
		GuVO result01 = glist.get(0);
		GuVO result02 = glist.get(1);

		
		Iterator iter = glist.iterator();
		
		System.out.println(result01.getG_name());
		System.out.println(result02.getG_name());
	}
}
