import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteExcelFile {

	public static void readXLSXFile() throws IOException {
		InputStream ExcelFileToRead = new FileInputStream("D:/workspace/extract/final.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(ExcelFileToRead);
		File file = new File("D:/workspace/extract/json/matches.json");
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);

		XSSFWorkbook test = new XSSFWorkbook();

		XSSFSheet sheet = wb.getSheetAt(0);
		XSSFRow row;
		XSSFCell cell;

		Iterator rows = sheet.rowIterator();

		while (rows.hasNext()) {
			row = (XSSFRow) rows.next();
			int row_val = row.getRowNum();
			Match mt = new Match();
			// System.out.println(row_val);
			Iterator cells = row.cellIterator();
			while (cells.hasNext()) {
				cell = (XSSFCell) cells.next();

				if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
					String location = cell.getReference();
					String var = cell.getStringCellValue();
					if (location.startsWith("B"))
						mt.setLocation(var);
					if (location.startsWith("C"))
						mt.setTournament(var);
					if (location.startsWith("E"))
						mt.setSeries(var);
					if (location.startsWith("F"))
						mt.setCourt(var);
					if (location.startsWith("H"))
						mt.setRound(var);
					if (location.startsWith("G"))
						mt.setSurface(var);
					if (location.startsWith("J")) {
						mt.setPlayer1(var);
						mt.setWinner(var);
					}
					if (location.startsWith("K"))
						mt.setPlayer2(var);

					// System.out.print(cell.getStringCellValue()+" ");
				} else if (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
					String location = cell.getReference();
					if (location.startsWith("D")) {
						SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
						String cellValue = sdf.format(cell.getDateCellValue());
						mt.setDate(cellValue);
					}
				} else if (DateUtil.isCellDateFormatted(cell)) {
					String location = cell.getReference();
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

				} else {
				}

			}
			bw.write(mt.toString());
			bw.newLine();

		}
		bw.close();
	}

	public static void main(String[] args) throws IOException {

		String curDir = System.getProperty("user.dir");
		File GradeList = new File("GradeList.txt");
		System.out.println("Current sys dir: " + curDir);
		System.out.println("Current abs dir: " + GradeList.getAbsolutePath());
		
		readXLSXFile();
System.out.println("Done");
	}

}