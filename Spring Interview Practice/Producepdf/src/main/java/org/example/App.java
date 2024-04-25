package org.example;

//import com.aspose.pdf.XmpValue;
//import com.aspose.pdf.facades.PdfFileInfo;
import com.aspose.pdf.facades.PdfFileInfo;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
//import com.itextpdf.layout.Document;
//import com.itextpdf.layout.Document;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.IBlockElement;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
//import com.itextpdf.text.Paragraph;
import com.itextpdf.layout.properties.BackgroundImage;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.pdf.PdfAStamper;
//import com.itextpdf.text.Font;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.kernel.pdf.extgstate.PdfExtGState;
import com.itextpdf.kernel.pdf.WriterProperties;

import javax.swing.text.StyleConstants;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

//import static com.itextpdf.kernel.pdf.PdfName.Document;

/**
 * Hello world!
 *
 */
public class App 
{
    public static final String DEST = "C:/Users/dikon/Downloads/Exampledoc.pdf";
    public static final String BG_IMAGE = "C:/Users/dikon/OneDrive/Pictures/Q_image_coppy.png";
    public static final String img = "C:/Users/dikon/Downloads/Q_image.png";

    private static Font headfont;
    private static Font normalfont;

    static {

        headfont = new Font(Font.FontFamily.TIMES_ROMAN, 26,
                Font.BOLD);
        normalfont= new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.getStyleValue("BLACK"));
    }

    public static void main(String args[]) {

        PdfDocument pdfDocument = null;
        try {
            PdfWriter writer = new PdfWriter(DEST);
            pdfDocument = new PdfDocument(writer);
            pdfDocument.setDefaultPageSize(PageSize.A4);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Document document = new Document(pdfDocument);
        try {
            new App().addBGI(DEST,pdfDocument,document);
            System.out.println("bg_image added!!");
            new App().addImage(DEST,pdfDocument,document);
            System.out.println("image added!!");
            new App().updateMetadata(DEST);
            //new App().addTitle(DEST,pdfDocument,document);
            System.out.println("Addded title.");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //close the document
        document.close();

        System.out.println("Awesome PDF just got created.");


        // to change the pdf file metadata

//        try {
//            PdfDocument pdfDocument = new PdfDocument(new PdfWriter(DEST));
//            Document doc = new Document(pdfDocument);
//            pdfDocument.getDocumentInfo().setProducer("iText® Core 8.0.3 ©2000-2024 iText Group NV(AGPL-Version)");
//            pdfDocument.getDocumentInfo().setAuthor("");
//            pdfDocument.getDocumentInfo().setCreator("");
//            System.out.println(pdfDocument.getDocumentInfo().getMoreInfo("Producer"));
//            doc.close();
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }


    }

//    protected void addTitle(String dest, PdfDocument pdfDocument, Document document) {
//        Paragraph preface = new Paragraph();
//        // We add one empty line
//        addEmptyLine(preface, 2);
//
//        // Lets write a big header
//        preface.add(new Paragraph("Title of the document",headfont));
//
//        addEmptyLine(preface, 1);
//
//    }

    private void addEmptyLine(Paragraph preface, int number) {

            for (int i = 0; i < number; i++) {
                preface.add(new Paragraph(" "));
            }

    }

    protected void updateMetadata(String dest) throws FileNotFoundException {
       /* PdfFileInfo fileInfo = new PdfFileInfo(dest);
        System.out.println(fileInfo.isPdfFile());
        fileInfo.setCreator("");
        fileInfo.setAuthor("");
        System.out.println("create time: "+fileInfo.getCreationDate());
        fileInfo.setModDate(fileInfo.getCreationDate());
        System.out.println("mod time: "+fileInfo.getModDate());

        System.out.println(fileInfo.getProducer());

        fileInfo.saveNewInfo(DEST);

        */
        PdfDocument pdfDoc = new PdfDocument(new PdfWriter(dest));
        Document doc = new Document(pdfDoc);

        pdfDoc.getDocumentInfo().setTitle("Some example");

        // Add metadata to pdf document
        System.out.println("Creation date: "+pdfDoc.getDocumentInfo().addModDate().toString());
        Paragraph p = new Paragraph("Hello World");

        doc.add(p);
        System.out.println("file properties changed.");
    }

    protected void addImage(String dest, PdfDocument pdfDocument, Document document) {
        ImageData data
                = null;
        try {
            data = ImageDataFactory.create(img);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        // Creating an Image object
        Image image = new Image(data);

        image.setWidth(110);
        image.setHeight(80);

        // Set the position of the image.
        image.setFixedPosition(460, 760);


        // Adding image to the document
        document.add(image);

    }

    protected void addBGI(String dest, PdfDocument pdfDoc, Document doc) throws Exception {
        //PdfDocument pdfDoc = new PdfDocument(new PdfWriter(dest));
        PageSize pageSize = PageSize.A4;
        //Document doc = new Document(pdfDoc, pageSize);

        ImageData image = ImageDataFactory.create(BG_IMAGE);
        PdfCanvas canvas = new PdfCanvas(pdfDoc.addNewPage());
        canvas.saveState();
        PdfExtGState state = new PdfExtGState().setFillOpacity(0.4f);
        canvas.setExtGState(state);
        System.out.println("image width = "+pageSize.getWidth()+" and height = "+pageSize.getHeight());

        Rectangle rect = new Rectangle(70, 180, 450, 520);
        System.out.println("image positions = "+rect.getX()+", "+rect.getY());
        canvas.addImageFittedIntoRectangle(image, rect, false);
        canvas.restoreState();

    }

}
