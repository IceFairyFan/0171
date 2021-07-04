package com.application.posapplication;

import com.microsoft.cognitiveservices.speech.SpeechConfig;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.microsoft.cognitiveservices.speech.*;
import com.microsoft.cognitiveservices.speech.audio.AudioConfig;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@RestController //This wasn't here
@SpringBootApplication
public class PosApplication {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        SpringApplication.run(PosApplication.class, args);
        System.out.println("Test Run.");

//        SpeechConfig speechConfig = SpeechConfig.fromSubscription("aec055f84d7d491d808b453ee675c8c4","eastasia");
    }

//    public static void fromMic(SpeechConfig speechConfig) throws InterruptedException, ExecutionException{
//
//    }


































//        IndonesiaNER iner = new IndonesiaNER(IndonesiaNER.MODEL.YUSUFS);
//        ArrayList<TextSequence.Sentence> predicted = iner.predictWithEmbeddedModel("Sebagai seorang pengguna, pengguna dapat memasukkan username dan password untuk aktivitas login.", true);
//
////        try {
////            Connection conn = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-J6HCJ4JQ\\SQLEXPRESS:1433;databaseName=DatabaseCapstone;user=sa;password=123456;");
//
//            for (TextSequence.Sentence arrWords : predicted) {
//                for (TextSequence.Words word : arrWords.getWords()) {
//                    String kata = word.getToken();
//                    String labelPos = word.getPosTag();
////                    System.out.println(kata + ", " + labelPos);
//
//                }
//            }
////        } catch (SQLException ex) {
////            ex.printStackTrace();
////        }
//    }
}
