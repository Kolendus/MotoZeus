package model;

import java.io.FileOutputStream;
import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreatePDF {
    // Destination of produced order, you have to change it accordingly to your computer
    private static final String FILE = "C:\\Users\\Michał\\Desktop\\";
    private static final Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
            Font.BOLD);
    private static final Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.NORMAL, BaseColor.RED);
    private static final Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
            Font.BOLD);
    private static final Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.BOLD);
    private static Model model = new Model();
    private static Motorcycle motor;
    private static User username;

    public CreatePDF(Motorcycle motor, User usernew) {
        this.motor = motor;
        this.username = usernew;
    }

    public String createPDF() {
        try {
            Document document = new Document(PageSize.A4.rotate());
            String path = FILE + username.getUsername() + "-" + "order.pdf";
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(path));
            document.open();
            addMetaData(document);
            addImage(document);
            addContent(document);
            addImage(document, motor);
            document.close();
            return path;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void addMetaData(Document document) {
        document.addTitle("Order Confirmation");
        document.addSubject("Order");
        document.addKeywords("Motozeus, Order");
        document.addAuthor("MotoZeus");
        document.addCreator("Michał Kolendo");
    }

    private static void addContent(Document document) throws DocumentException {
        Anchor anchor = new Anchor("", catFont);
        anchor.setName("");

        Chapter catPart = new Chapter(new Paragraph(anchor), 1);

        Paragraph subPara = new Paragraph("Order", subFont);
        Section subCatPart = catPart.addSection(subPara);

        Paragraph paragraph = new Paragraph();

        subCatPart.add(paragraph);

        // add a table
        createTable(document, motor, username);

    }

    private static void createTable(Document document, Motorcycle motor, User user)
            throws BadElementException {
        PdfPTable table = new PdfPTable(2);

        PdfPCell c1 = new PdfPCell(new Phrase("Seller"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);
        table.addCell("MotoZeus z.o.o Białystok");
        table.setHeaderRows(1);
        PdfPCell c2 = new PdfPCell(new Phrase("Buyer"));
        c2.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c2);
        table.addCell(user.getUsername());
        PdfPCell c3 = new PdfPCell(new Phrase("Model"));
        c3.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c3);
        table.addCell(motor.getName());

        PdfPCell c4 = new PdfPCell(new Phrase("Price"));
        c4.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c4);
        table.addCell(String.valueOf(motor.getPrice()));

        PdfPCell c5 = new PdfPCell(new Phrase("Production year"));
        c5.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c5);
        table.addCell(String.valueOf(motor.getProductionYear()));

        try {
            document.add(table);

        } catch (DocumentException ex) {
            Logger.getLogger(CreatePDF.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static void addImage(Document document) {
        try {
            Image img = Image.getInstance("src\\resources\\Front\\Logomakr_2QPckw.png");
            img.scaleAbsolute(100f, 100f);
            document.add(img);

        } catch (BadElementException ex) {
            Logger.getLogger(CreatePDF.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CreatePDF.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(CreatePDF.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void addImage(Document document, Motorcycle motor) {
        try {
            // Adding a java.awt.Image
            java.awt.Image motorcycleImage = motor.getMotoPhoto();
            Image img = com.itextpdf.text.Image.getInstance(motorcycleImage, null);
            img.scaleAbsolute(300f, 300f);
            img.setAbsolutePosition(400, 50);
            document.add(img);

        } catch (BadElementException ex) {
            Logger.getLogger(CreatePDF.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (DocumentException | IOException ex) {
            Logger.getLogger(CreatePDF.class
                    .getName()).log(Level.SEVERE, null, ex);

        }
    }

}
