package in.co.rays.proj4.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.proj4.bean.StudentBean;
import in.co.rays.proj4.exception.ApplicationException;
import in.co.rays.proj4.model.StudentModel;

public class TestStudentModel {
	
	public static void main(String[] args) throws Exception {
		
		 testAdd();
		// testUpdate();
		// testDelete();
		// testFindByPk();
		// testFindByEmail();
		// testSearch();
	}
	
	public static void testAdd() throws Exception {
		
		StudentBean bean = new StudentBean();
		
		bean.setFirstName("john");
		bean.setLastName("smith");
		bean.setDob(new Date());
		bean.setGender("male");
		bean.setMobileNo("7648880088");
		bean.setEmail("john@gmail.com");
		bean.setCollegeId(2);
		bean.setCreatedBy("admin@gmail.com");
		bean.setModifiedBy("admin@gmail.com");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));
		
		StudentModel model = new StudentModel();
		
		model.add(bean);
	}
	
	public static void testUpdate() throws Exception {
		
		StudentBean bean = new StudentBean();
		
		bean.setId(1);
		bean.setFirstName("john");
		bean.setLastName("doe");
		bean.setDob(new Date());
		bean.setGender("male");
		bean.setMobileNo("7648880088");
		bean.setEmail("john@gmail.com");
		bean.setCollegeId(1);
		bean.setCollegeName("davv");
		bean.setCreatedBy("admin@gmail.com");
		bean.setModifiedBy("admin@gmail.com");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));
		
		StudentModel model = new StudentModel();
		model.update(bean);
	}
	
	public static void testDelete() throws ApplicationException { 
		
		StudentBean bean = new  StudentBean();
		StudentModel model = new  StudentModel();
		model.delete(1);
				
	}
	
	public static void testFindByPk() throws Exception {

		StudentModel model = new StudentModel();

		StudentBean bean = model.findByPk(1);

		if (bean != null) {
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getDob());
			System.out.print("\t" + bean.getGender());
			System.out.print("\t" + bean.getMobileNo());
			System.out.print("\t" + bean.getEmail());
			System.out.print("\t" + bean.getCollegeId());
			System.out.print("\t" + bean.getCollegeName());
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		} else {
			System.out.println("id not found");
		}
	}

	public static void testFindByEmail() throws Exception {

		StudentModel model = new StudentModel();

		StudentBean bean = model.findByEmail("uday@gmail.com");

		if (bean != null) {
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getDob());
			System.out.print("\t" + bean.getGender());
			System.out.print("\t" + bean.getMobileNo());
			System.out.print("\t" + bean.getEmail());
			System.out.print("\t" + bean.getCollegeId());
			System.out.print("\t" + bean.getCollegeName());
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		} else {
			System.out.println("email not found");
		}
	}

	public static void testSearch() throws Exception {

		StudentBean bean = new StudentBean();
		bean.setFirstName("u");

		StudentModel model = new StudentModel();

		List list = model.search(bean, 1, 10);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			bean = (StudentBean) it.next();
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getDob());
			System.out.print("\t" + bean.getGender());
			System.out.print("\t" + bean.getMobileNo());
			System.out.print("\t" + bean.getEmail());
			System.out.print("\t" + bean.getCollegeId());
			System.out.print("\t" + bean.getCollegeName());
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		}
	}
	
}
