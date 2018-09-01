package com.yc.tims.utils;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;



public class ExcelUtil {


	/**
	 * 我们传入数据 生成的excel的title 列的名字 然后得到workbook
	 * @param title 生成的excel的名字
	 * @param headers 列的显示名称 header和include要一对一
	 * @param include 显示的列
	 * @param data 传入的数据
	 *
	 * @return wb 生成的WorkBook
	 */
	public static <T> Workbook export(String title,Map<String,String> params,List<T> data){
		//生成workbook
		Workbook wb = new HSSFWorkbook();

		Sheet sheet = wb.createSheet("Sheet 1");

		//构建title
		Row title_row = sheet.createRow(0);
		Cell title_cell = title_row.createCell(0);
		//设置值
		title_cell.setCellValue(title);
		//设置样式
		CellStyle title_style = wb.createCellStyle();
		title_style.setAlignment(CellStyle.ALIGN_CENTER);
		title_style.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
		title_cell.setCellStyle(title_style);
		sheet.addMergedRegion(new CellRangeAddress(0,0,0,params.size()-1));
		//设置行高
		title_row.setHeight((short)(20*20));

		//构建表头
		Row header_row = sheet.createRow(1);

		int ii = 0;

		for(String key:params.keySet()){
			sheet.setColumnWidth(ii, 256*24);
			Cell header_cell = header_row.createCell(ii);
			//设置值
			header_cell.setCellValue(params.get(key));
			//设置样式
			header_cell.setCellStyle(title_style);
			ii++;
		}

		//得到一个样本 主要用于反射结构信息
		//T d = data.get(0);
		//Class<?> clazz = d.getClass();

		Class<?> clazz = data.get(0).getClass();

		//得到列（Field）
		//Field []fields = clazz.getDeclaredFields();

		try{
			for(int i=0;i<data.size();i++){
				//表示一行
				Row row = sheet.createRow(i+2);
				T temp = data.get(i);
				//遍历属性 （列）
				int j=0;
				for(String key :params.keySet()){
					//创建一个单元格
					Cell cell = row.createCell(j);
					Method method = clazz.getDeclaredMethod(BeanUtil.getter(key));
					Object value = method.invoke(temp);

					if(value==null){
						cell.setCellValue("");
					}else{
						if(value instanceof Date){
							//如果是日期类型 需要强转 而且需要设置格式
							cell.setCellValue((Date)value);
							//创建一个style
							CellStyle style = wb.createCellStyle();
							//创建一个数据格式化器
							style.setDataFormat(wb.getCreationHelper().createDataFormat().getFormat("yyyy年MM月dd日 hh:mm:ss"));
							cell.setCellStyle(style);
						}else if(value instanceof Number){ //判断是否为数字
							cell.setCellValue(Double.parseDouble(value+""));
						}else if(value instanceof String){
							if(Pattern.matches("^\\d+(\\.\\d+)?$", value+"")){ //判断是否为纯数字的字符串
								cell.setCellValue(Double.parseDouble(value+""));
							}else{
								cell.setCellValue(value+"");
							}
						}
					}
					j++;
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

		return wb;
	}


	public static <T> Workbook export(String title,String []headers,String []include,List<T> data){
		//生成workbook
		Workbook wb = new HSSFWorkbook();

		Sheet sheet = wb.createSheet("Sheet 1");

		//构建title
		Row title_row = sheet.createRow(0);
		Cell title_cell = title_row.createCell(0);
		//设置值
		title_cell.setCellValue(title);
		//设置样式
		CellStyle title_style = wb.createCellStyle();
		title_style.setAlignment(CellStyle.ALIGN_CENTER);
		title_style.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
		title_cell.setCellStyle(title_style);
		sheet.addMergedRegion(new CellRangeAddress(0,0,0,headers.length-1));
		//设置行高
		title_row.setHeight((short)(20*20));

		//构建表头
		Row header_row = sheet.createRow(1);
		for(int i=0;i<headers.length;i++){
			sheet.setColumnWidth(i, 256*24);
			Cell header_cell = header_row.createCell(i);
			//设置值
			header_cell.setCellValue(headers[i]);
			//设置样式
			header_cell.setCellStyle(title_style);
		}

		//得到一个样本 主要用于反射结构信息
		//T d = data.get(0);
		//Class<?> clazz = d.getClass();

		Class<?> clazz = data.get(0).getClass();

		//得到列（Field）
		//Field []fields = clazz.getDeclaredFields();

		try{
			for(int i=0;i<data.size();i++){
				//表示一行
				Row row = sheet.createRow(i+2);
				T temp = data.get(i);
				//遍历属性 （列）
				for(int j=0;j<include.length;j++){
					//创建一个单元格
					Cell cell = row.createCell(j);
					Method method = clazz.getDeclaredMethod(BeanUtil.getter(include[j]));
					Object value = method.invoke(temp);

					if(value==null){
						cell.setCellValue("");
					}else{
						if(value instanceof Date){
							//如果是日期类型 需要强转 而且需要设置格式
							cell.setCellValue((Date)value);
							//创建一个style
							CellStyle style = wb.createCellStyle();
							//创建一个数据格式化器
							style.setDataFormat(wb.getCreationHelper().createDataFormat().getFormat("yyyy年MM月dd日 hh:mm:ss"));
							cell.setCellStyle(style);
						}else if(value instanceof Number){ //判断是否为数字
							cell.setCellValue(Double.parseDouble(value+""));
						}else if(value instanceof String){
							if(Pattern.matches("^\\d+(\\.\\d+)?$", value+"")){ //判断是否为纯数字的字符串
								cell.setCellValue(Double.parseDouble(value+""));
							}else{
								cell.setCellValue(value+"");
							}
						}
					}
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

		return wb;
	}

	/**
	 * 我们传入数据 生成的excel的title 列的名字 然后得到workbook
	 * @param title 生成的excel的名字
	 * @param headers 列的显示名称
	 * @param data 传入的数据
	 *
	 * @return wb 生成的WorkBook
	 */

	public static <T> Workbook export(String title,String []headers,List<T> data){
		//生成workbook
		Workbook wb = new HSSFWorkbook();

		Sheet sheet = wb.createSheet("Sheet 1");

		//构建title
		Row title_row = sheet.createRow(0);
		Cell title_cell = title_row.createCell(0);
		//设置值
		title_cell.setCellValue(title);
		//设置样式
		CellStyle title_style = wb.createCellStyle();
		title_style.setAlignment(CellStyle.ALIGN_CENTER);
		title_style.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
		title_cell.setCellStyle(title_style);
		sheet.addMergedRegion(new CellRangeAddress(0,0,0,headers.length-1));
		//设置行高
		title_row.setHeight((short)(20*20));

		//构建表头
		Row header_row = sheet.createRow(1);
		for(int i=0;i<headers.length;i++){
			sheet.setColumnWidth(i, 256*24);
			Cell header_cell = header_row.createCell(i);
			//设置值
			header_cell.setCellValue(headers[i]);
			//设置样式
			header_cell.setCellStyle(title_style);
		}

		//得到一个样本 主要用于反射结构信息
		//T d = data.get(0);
		//Class<?> clazz = d.getClass();

		Class<?> clazz = data.get(0).getClass();

		//得到列（Field）
		Field []fields = clazz.getDeclaredFields();

		try{
			for(int i=0;i<data.size();i++){
				//表示一行
				Row row = sheet.createRow(i+2);
				T temp = data.get(i);
				//遍历属性 （列）
				for(int j=0;j<fields.length;j++){
					//创建一个单元格
					Cell cell = row.createCell(j);
					Method method = clazz.getDeclaredMethod(BeanUtil.getter(fields[j]));

					Object value = method.invoke(temp);

					if(value==null){
						cell.setCellValue("");
					}else{
						if(value instanceof Date){
							//如果是日期类型 需要强转 而且需要设置格式
							cell.setCellValue((Date)value);
							//创建一个style
							CellStyle style = wb.createCellStyle();
							//创建一个数据格式化器
							style.setDataFormat(wb.getCreationHelper().createDataFormat().getFormat("yyyy年MM月dd日 hh:mm:ss"));
							cell.setCellStyle(style);
						}else if(value instanceof Number){ //判断是否为数字
							cell.setCellValue(Double.parseDouble(value+""));
						}else if(value instanceof String){
							if(Pattern.matches("^\\d+(\\.\\d+)?$", value+"")){ //判断是否为纯数字的字符串
								cell.setCellValue(Double.parseDouble(value+""));
							}else{
								cell.setCellValue(value+"");
							}
						}
					}
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

		return wb;
	}

//	public static void main(String[] args) {
//		
//
//		Workbook wb = export("用户信息", new String[]{"ID","用户名","年龄","邮箱"},new String[]{"id","username","age","email"}, dao.findAll());
//
//		try {
//			FileOutputStream out = new FileOutputStream("F:/text-export.xls");
//			wb.write(out);
//			out.flush();
//			out.close();
//			((FileOutputStream) wb).close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
}











