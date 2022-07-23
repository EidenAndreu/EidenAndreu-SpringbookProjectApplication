package com.example.eidenandreupringbookproject;

import com.example.eidenandreupringbookproject.data.dto.BookDTO;
import com.example.eidenandreupringbookproject.manager.BookDashboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EidenAndreu_SPringbookProjectApplication implements CommandLineRunner {
    @Autowired
    BookDashboard bookDashboard;

    public static void main(String[] args) {
        SpringApplication.run(EidenAndreu_SPringbookProjectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        bookDashboard.menu();

    }
}
