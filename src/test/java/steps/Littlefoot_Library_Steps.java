package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.apache.commons.exec.ExecuteException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.support.ui.Select;
import pages.Littlefoot_Library;
import utilities.Config;
import utilities.Driver;

import java.io.*;

public class Littlefoot_Library_Steps {

    Littlefoot_Library littlefootLibrary = new Littlefoot_Library();




    @Given("User is on Littlefoot Library page")
    public void user_is_on_Littlefoot_Library_page() {
        Driver.getDriver().get(Config.getProperty("kinURL"));
    }

    @Given("User enters {string} and {string}")
    public void user_enters_and(String fistName, String lastName) {
        littlefootLibrary.fistName.sendKeys(fistName);
        littlefootLibrary.lastName.sendKeys(lastName);
    }

    @And("User puts {string} and {string}")
    public void userPutsAnd(String title, String author) {
        littlefootLibrary.title.sendKeys(title);
        littlefootLibrary.author.sendKeys(author);
    }

    @Given("User enters {string}, {string} and {string}")
    public void user_enters_and(String pages, String DDC, String readStatus) {
        littlefootLibrary.pages.sendKeys(pages);
        littlefootLibrary.dewey_decimal.sendKeys(DDC);

        Select select = new Select(littlefootLibrary.dropdown);
        select.selectByVisibleText(readStatus);

        int ddc = Integer.parseInt(DDC.substring(0,1));

        Littlefoot_Library.totalPages.putIfAbsent("Computer Science, Information & General Works", 0);
        Littlefoot_Library.totalPages.putIfAbsent("Philosophy & Psychology", 0);
        Littlefoot_Library.totalPages.putIfAbsent("Religion", 0);
        Littlefoot_Library.totalPages.putIfAbsent("Social Sciences", 0);
        Littlefoot_Library.totalPages.putIfAbsent("Language", 0);
        Littlefoot_Library.totalPages.putIfAbsent("Pure Science", 0);
        Littlefoot_Library.totalPages.putIfAbsent("Applied Science", 0);
        Littlefoot_Library.totalPages.putIfAbsent("Arts & Recreation", 0);
        Littlefoot_Library.totalPages.putIfAbsent("Literature", 0);
        Littlefoot_Library.totalPages.putIfAbsent("History & Geography", 0);


        if (ddc ==0) {

            if (readStatus.equals("Fully")) {
                Littlefoot_Library.totalPages.put("Computer Science, Information & General Works", Littlefoot_Library.totalPages.get("Computer Science, Information & General Works") + Integer.valueOf(pages));

            } else if (readStatus.equals("Partially")) {
                Littlefoot_Library.totalPages.put("Computer Science, Information & General Works", Littlefoot_Library.totalPages.get("Computer Science, Information & General Works") + Integer.valueOf(pages) / 2);
            }
        }
        if (ddc ==1) {

            if (readStatus.equals("Fully")) {
                Littlefoot_Library.totalPages.put("Philosophy & Psychology", Littlefoot_Library.totalPages.get("Philosophy & Psychology") + Integer.valueOf(pages));

            } else if (readStatus.equals("Partially")) {
                Littlefoot_Library.totalPages.put("Philosophy & Psychology", Littlefoot_Library.totalPages.get("Philosophy & Psychology") + Integer.valueOf(pages) / 2);
            }
        }
        if (ddc ==2) {

            if (readStatus.equals("Fully")) {
                Littlefoot_Library.totalPages.put("Religion", Littlefoot_Library.totalPages.get("Religion") + Integer.valueOf(pages));

            } else if (readStatus.equals("Partially")) {
                Littlefoot_Library.totalPages.put("Religion", Littlefoot_Library.totalPages.get("Religion") + Integer.valueOf(pages) / 2);
            }
        }
        if (ddc ==3) {

            if (readStatus.equals("Fully")) {
                Littlefoot_Library.totalPages.put("Social Sciences", Littlefoot_Library.totalPages.get("Social Sciences") + Integer.valueOf(pages));

            } else if (readStatus.equals("Partially")) {
                Littlefoot_Library.totalPages.put("Social Sciences", Littlefoot_Library.totalPages.get("Social Sciences") + Integer.valueOf(pages) / 2);
            }
        }
        if (ddc ==4) {

            if (readStatus.equals("Fully")) {
                Littlefoot_Library.totalPages.put("Language", Littlefoot_Library.totalPages.get("Language") + Integer.valueOf(pages));

            } else if (readStatus.equals("Partially")) {
                Littlefoot_Library.totalPages.put("Language", Littlefoot_Library.totalPages.get("Language") + Integer.valueOf(pages) / 2);
            }
        }
        if (ddc ==5) {

            if (readStatus.equals("Fully")) {
                Littlefoot_Library.totalPages.put("Pure Science", Littlefoot_Library.totalPages.get("Pure Science") + Integer.valueOf(pages));

            } else if (readStatus.equals("Partially")) {
                Littlefoot_Library.totalPages.put("Pure Science", Littlefoot_Library.totalPages.get("Pure Science") + Integer.valueOf(pages) / 2);
            }
        }
        if (ddc ==6) {

            if (readStatus.equals("Fully")) {
                Littlefoot_Library.totalPages.put("Applied Science", Littlefoot_Library.totalPages.get("Applied Science") + Integer.valueOf(pages));

            } else if (readStatus.equals("Partially")) {
                Littlefoot_Library.totalPages.put("Applied Science", Littlefoot_Library.totalPages.get("Applied Science") + Integer.valueOf(pages) / 2);
            }
        }
        if (ddc ==7) {

            if (readStatus.equals("Fully")) {
                Littlefoot_Library.totalPages.put("Arts & Recreation", Littlefoot_Library.totalPages.get("Arts & Recreation") + Integer.valueOf(pages));

            } else if (readStatus.equals("Partially")) {
                Littlefoot_Library.totalPages.put("Arts & Recreation", Littlefoot_Library.totalPages.get("Arts & Recreation") + Integer.valueOf(pages) / 2);
            }
        }
        if (ddc ==8) {

            if (readStatus.equals("Fully")) {
                Littlefoot_Library.totalPages.put("Literature", Littlefoot_Library.totalPages.get("Literature") + Integer.valueOf(pages));

            } else if (readStatus.equals("Partially")) {
                Littlefoot_Library.totalPages.put("Literature", Littlefoot_Library.totalPages.get("Literature") + Integer.valueOf(pages) / 2);
            }
        }
        if (ddc ==9) {

            if (readStatus.equals("Fully")) {
                Littlefoot_Library.totalPages.put("History & Geography", Littlefoot_Library.totalPages.get("History & Geography") + Integer.valueOf(pages));

            } else if (readStatus.equals("Partially")) {
                Littlefoot_Library.totalPages.put("History & Geography", Littlefoot_Library.totalPages.get("History & Geography") + Integer.valueOf(pages) / 2);
            }
        }

    }

    @Then("Librarian gets the report")
    public void librarian_gets_the_report() {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("report");
        Cell cell;
        Cell cell2;
        int count = 0;

        for (String a: Littlefoot_Library.totalPages.keySet()) {
            Row row = sheet.createRow(count);
            cell = row.createCell(0);
            cell.setCellValue(a);
            cell2 = row.createCell(1);
            cell2.setCellValue(Littlefoot_Library.totalPages.get(a));
            count++;
        }

        try{

            FileOutputStream out = new FileOutputStream(new File("data.xlsx"));
            workbook.write(out);
            out.close();

        }catch (ExecuteException e){
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




