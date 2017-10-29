package com.example.vanes.myapplication;

import android.os.Environment;
import android.provider.DocumentsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CrearPDF(View view) throws FileNotFoundException, DocumentException {
        EditText _txt=(EditText)findViewById(R.id.txt_input);
        Document doc=new Document();
        String outPath= Environment.getExternalStorageDirectory()+"/mypdf.pdf";
        PdfWriter.getInstance(doc,new FileOutputStream(outPath));
        doc.open();
        doc.add(new Paragraph(_txt.getText().toString()));
        doc.close();

    }
}
