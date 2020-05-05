package com.hrms.values;

import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;

public class ExcelGlobalValues{
	
	public String general_form_location = "D:\\excel_files_for_selenium\\general_form_xls.xls";
	
	public FileInputStream file;
	
	public Workbook wb;
	
	public Sheet st;

	public String company_info = st.getCell(0, 1).getContents();

	public String tax_id = st.getCell(1, 1).getContents();

	public String naics = st.getCell(2, 1).getContents();

	public String phone = st.getCell(3, 1).getContents();

	public String fax = st.getCell(4, 1).getContents();

	public String country = st.getCell(5, 1).getContents();

	public String add1 = st.getCell(6, 1).getContents();

	public String add2 = st.getCell(7, 1).getContents();

	public String city = st.getCell(8, 1).getContents();

	public String state_province = st.getCell(9, 1).getContents();

	public String zip = st.getCell(10, 1).getContents();

	public String comments = st.getCell(11, 1).getContents();

}
