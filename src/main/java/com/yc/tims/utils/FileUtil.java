package com.yc.tims.utils;

import java.io.File;
import java.io.FileOutputStream;
/**
 * 文件上传工具类  
 * 配合spring使用
 * @author Administrator
 *
 */
public class FileUtil {
 
	/**
	 *  文件上传
	 * @param file   文件内容
	 * @param filePath 文件路径
	 * @param fileName 文件名
	 * @throws Exception
	 */
	public static void uploadFile(byte[] file, String filePath, String fileName) throws Exception { 
        File targetFile = new File(filePath);  
        if(!targetFile.exists()){    
            targetFile.mkdirs();    
        }       
        FileOutputStream out = new FileOutputStream(filePath+fileName);
        out.write(file);
        out.flush();
        out.close();
    }
}
