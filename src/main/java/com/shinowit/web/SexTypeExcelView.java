package com.shinowit.web;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shinowit.entity.SexType;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;

import org.springframework.web.servlet.view.document.AbstractExcelView;

public class SexTypeExcelView extends AbstractExcelView {

    private final Logger LOGGER = Logger.getLogger(getClass());
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyyMMdd");

    @Override
    @SuppressWarnings({"unchecked"})
    protected void buildExcelDocument(
            Map<String, Object> model,        // MVC中的M就在这里了
            HSSFWorkbook workbook,
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        List<SexType> recordList = (List<SexType>) model.get("sex_type_list");

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("待输出的记录条数: "+recordList.size());
        }

        HSSFSheet sheet = workbook.createSheet("sheet1");

        setColumnsWidth(sheet);
        fillTableHeader(workbook, sheet);
        fillTableBody(workbook, sheet, recordList);
    }

    private void setColumnsWidth(HSSFSheet sheet) {
        final int[] warr = new int[]{
                500,  // <空>
                4500, // 性别分类编码
                4500 // 性别分类名称
        };
        for (int i = 0; i < warr.length; i++) {
            sheet.setColumnWidth(i, warr[i]);
        }
    }

    // 填充表格头
    private void fillTableHeader(HSSFWorkbook workbook, HSSFSheet sheet) {
        final String[] contents = new String[]{
                "编码",
                "分类"
        };

        int r = 1;
        int c = 1;

        CellStyle style = workbook.createCellStyle();
        style.setFillForegroundColor(IndexedColors.YELLOW.getIndex());        // 填充黄色
        style.setFillPattern(CellStyle.SOLID_FOREGROUND);            // 填充方式

        // 设置border
        style.setBorderLeft(CellStyle.BORDER_THIN);
        style.setBorderRight(CellStyle.BORDER_THIN);
        style.setBorderTop(CellStyle.BORDER_THIN);
        style.setBorderBottom(CellStyle.BORDER_THIN);

        for (int i = 0; i < contents.length; i++) {
            Cell cell = getCell(sheet, r, c + i);
            cell.setCellValue(contents[i]);
            cell.setCellStyle(style);
        }
    }

    private void fillTableBody(HSSFWorkbook workbook, HSSFSheet sheet, List<SexType> records) {
        // 通用style
        CellStyle style = workbook.createCellStyle();
        style.setFillForegroundColor(IndexedColors.WHITE.getIndex());        // 填充白色
        style.setFillPattern(CellStyle.SOLID_FOREGROUND);                    // 填充方式
        style.setBorderLeft(CellStyle.BORDER_THIN);
        style.setBorderRight(CellStyle.BORDER_THIN);
        style.setBorderTop(CellStyle.BORDER_THIN);
        style.setBorderBottom(CellStyle.BORDER_THIN);

        // 日期style
        CellStyle dateStyle = workbook.createCellStyle();
        dateStyle.setFillForegroundColor(IndexedColors.WHITE.getIndex());        // 填充白色
        dateStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);                    // 填充方式
        dateStyle.setBorderLeft(CellStyle.BORDER_THIN);
        dateStyle.setBorderRight(CellStyle.BORDER_THIN);
        dateStyle.setBorderTop(CellStyle.BORDER_THIN);
        dateStyle.setBorderBottom(CellStyle.BORDER_THIN);
        dateStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("m/d/yy"));

        int r = 2;
        int c = 1;
        Cell cell = null;

        for (int i = 0; i < records.size(); i++) {
            SexType rr = records.get(i);

            // 编码
            cell = getCell(sheet, r, c + 0);
            if (rr.getSexCode() != null)
                cell.setCellValue(rr.getSexCode());
            cell.setCellStyle(dateStyle);

            // 分类名称
            cell = getCell(sheet, r, c + 1);
            if (rr.getSexTypeName() != null)
                cell.setCellValue(rr.getSexTypeName());
            cell.setCellStyle(style);

            r++;
        }
    }
}

