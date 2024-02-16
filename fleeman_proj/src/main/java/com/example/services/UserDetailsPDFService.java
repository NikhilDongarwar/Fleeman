package com.example.services;
import com.example.entities.Pdf_demo;
import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;

@Service
public class UserDetailsPDFService {

//    private final UserDetailsRepository userDetailsRepository;
//
//    @Autowired
//    public UserDetailsPDFService(UserDetailsRepository userDetailsRepository) {
//        this.userDetailsRepository = userDetailsRepository;
//    }

    public byte[] generateUserDetailsPDF(Pdf_demo userDetails) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PdfWriter writer = new PdfWriter(baos);
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf);

        try {
            document.add(new Paragraph("Name: " + userDetails.getName())
                    .setFont(PdfFontFactory.createFont(StandardFonts.HELVETICA)));
            document.add(new Paragraph("Email: " + userDetails.getEmail())
                    .setFont(PdfFontFactory.createFont(StandardFonts.HELVETICA)));
            document.add(new Paragraph("Arigato"+userDetails.getName())
            		.setFont(PdfFontFactory.createFont(StandardFonts.COURIER_BOLD)));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            document.close();
        }

        // Optionally save userDetails to the database
        //userDetailsRepository.saveUserDetails(userDetails);

        return baos.toByteArray();
    }
}
