package in.co.rays.proj4.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.proj4.bean.CourseBean;
import in.co.rays.proj4.model.CourseModel;

public class TestCourseModel {
	
	public static void main(String[] args) throws Exception {
		
		testAdd();
		// testUpdate();
		// testDelete();
		// testFindByPk();
		// testFindByName();
		// testSearch();
	}
	
	public static void testAdd() throws Exception {
		
		CourseBean bean = new CourseBean();
		
		bean.setName("python");
		bean.setDuration("2 years");
		bean.setDescription("test");
		bean.setCreatedBy("admin@gmail.com");
		bean.setModifiedBy("admin@gmail.com");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));
		
		CourseModel model = new CourseModel();
		model.add(bean);
	}
	
	public static void testUpdate() throws Exception {
		
		CourseModel model = new CourseModel();
		
		CourseBean bean = model.findByPk(2);
		
		bean.setName("BE");
		bean.setDuration("4 year");
		bean.setDescription("BE");
		
		model.add(bean);
	}
	
	public static void testDelete() throws Exception {
		
		// CourseBean bean = new CourseBean();
		CourseModel model = new CourseModel();
		model.delete(5);
	}
	
	public static void testFindByPk() throws Exception {
		
		CourseModel model = new CourseModel();
		CourseBean bean = model.findByPk(1);
		
		if(bean != null) {
			
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getDuration());
			System.out.print("\t" + bean.getDescription());
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		}else {
			System.out.println("id not found");
		}
		
	}
	
	public static void testFindByName() throws Exception {
		
		CourseModel model = new CourseModel();
		CourseBean bean = model.findByName("java");
		
		if(bean != null) {
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getDuration());
			System.out.print("\t" + bean.getDescription());
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		}else {
			System.out.println("name not found");
		}
	}
	
	public static void testSearch() throws Exception {
		
		CourseBean bean = new CourseBean();
		bean.setName("python");
		
		CourseModel model = new CourseModel();
		
		List list = model.search(bean, 1, 10);
		
		Iterator it = list.iterator();
		
		while (it.hasNext()) {
			bean = (CourseBean) it.next();
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getDuration());
			System.out.print("\t" + bean.getDescription());
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		}
	}
	

}
