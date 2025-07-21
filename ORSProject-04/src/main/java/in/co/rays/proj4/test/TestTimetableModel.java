package in.co.rays.proj4.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.proj4.bean.TimetableBean;
import in.co.rays.proj4.model.TimetableModel;

public class TestTimetableModel {
	
	public static void main(String[] args) throws Exception {
		
		testAdd();
		// testUpdate();
		// testDelete();
		// testFindByPk();
		// testSearch();
	}
	
	public static void testAdd() throws Exception {
		TimetableBean bean = new TimetableBean();
		
		bean.setSemester("demo");
		bean.setDescription("4th");
		bean.setExamDate(new Date());
		bean.setExamTime("11:00AM - 12:00PM");
		bean.setCourseId(3);
		bean.setSubjectId(2);
		bean.setCreatedBy("admin@gmail.com");
		bean.setModifiedBy("admin@gmail.com");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));
		
		TimetableModel model = new TimetableModel();
		model.add(bean);

	}
	
	public static void testUpdate() throws Exception {
		
		TimetableModel  model = new TimetableModel();
		
		TimetableBean bean = model.findByPk(2);
		bean.setSemester("2nd");
		bean.setDescription("2nd");
		bean.setExamDate(new Date());
		bean.setExamTime("11:00AM - 12:00PM");
		bean.setCourseId(1);
		bean.setSubjectId(1);
		
		model.update(bean);
	}
	
	public static void testDelete() throws Exception {
		TimetableModel model = new TimetableModel();
		model.delete(3);
	}
	
	public static void testFindByPk() throws Exception {
		
		TimetableModel model = new TimetableModel();
		TimetableBean bean = model.findByPk(1);
		
		if(bean != null) {
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getSemester());
			System.out.print("\t" + bean.getDescription());
			System.out.print("\t" + bean.getExamDate());
			System.out.print("\t" + bean.getExamTime());
			System.out.print("\t" + bean.getCourseId());
			System.out.print("\t" + bean.getCourseName());
			System.out.print("\t" + bean.getSubjectId());
			System.out.print("\t" + bean.getSubjectName());
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		}else {
			System.out.println("id not found");
		}

	}
	
	public static void testSearch() throws Exception {
		
		TimetableBean bean = new TimetableBean();
		
		bean.setSemester("1");
		
		TimetableModel model = new TimetableModel();
		
		List list = model.search(bean, 1, 10);
				
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			bean = (TimetableBean) it.next();
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getSemester());
			System.out.print("\t" + bean.getDescription());
			System.out.print("\t" + bean.getExamDate());
			System.out.print("\t" + bean.getExamTime());
			System.out.print("\t" + bean.getCourseId());
			System.out.print("\t" + bean.getCourseName());
			System.out.print("\t" + bean.getSubjectId());
			System.out.print("\t" + bean.getSubjectName());
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		}
	}

}
