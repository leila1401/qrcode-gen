package com.leila.Code.qrCode_working;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

@SpringBootApplication
public class QrCodeWorkingApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(QrCodeWorkingApplication.class, args);
		
		String data = "https://www.youtube.com/watch?v=238LfSBwvbs&t=270s";
		String path = "C:\\Users\\Admin\\Desktop\\QRCode\\tidiani.PNG";
		
		BitMatrix matrix = new MultiFormatWriter().encode
				(data, BarcodeFormat.PDF_417, 500, 500);
		//System.out.println(Arrays.stream(matrix.getEnclosingRectangle()).toArray().toString());
		
		MatrixToImageWriter.writeToPath(matrix, "PNG", Paths.get(path));
	}

}
