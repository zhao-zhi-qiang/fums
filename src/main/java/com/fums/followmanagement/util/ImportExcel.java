package com.fums.followmanagement.util;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: zhaozhiqiang
 * Date: 2020/7/12
 * Desc: 上传文件
 */
public class ImportExcel {

    public static List<List<Object>> readExcel(File file) throws IOException {
        String fileName = file.getName();
        String extension = fileName.lastIndexOf(".") == -1 ? "" : fileName.substring(fileName.lastIndexOf(".")+1);
        if ("xls".equals(extension)){
            HSSFWorkbook hssfWorkbook = new HSSFWorkbook(new FileInputStream(file));
            HSSFSheet sheet = hssfWorkbook.getSheetAt(0);
            return readExcel(sheet);
        }else if ("xlsx".equals(extension)){
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(new FileInputStream(file));
            XSSFSheet sheet = xssfWorkbook.getSheetAt(0);
            return readExcel(sheet);
        }else {
            throw new IOException("不支持的文件类型");
        }
    }


    private static List<List<Object>> readExcel(Sheet sheet){
        List<List<Object>> lists = new LinkedList<List<Object>>();
        Object value = null;
        Row row = null;
        Cell cell = null;
        for (int i = sheet.getFirstRowNum(); i < sheet.getPhysicalNumberOfRows(); i++) {
            row = sheet.getRow(i);
            if (row == null){
                continue;
            }
            List<Object> link = new LinkedList<Object>();
            for (int j = row.getFirstCellNum(); j < row.getLastCellNum(); j++) {
                cell = row.getCell(j);
                if (cell == null){
                    value = "";
                }else {
                    value = cell.toString();
                }

                if (value == null || "".equals(value)){
                    continue;
                }
                link.add(value);
            }
            lists.add(link);
        }
        return lists;

    }
}
