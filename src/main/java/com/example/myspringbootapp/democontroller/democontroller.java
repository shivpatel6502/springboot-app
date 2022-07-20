package com.example.myspringbootapp.democontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.util.Date;

@RestController
public class democontroller {

  @GetMapping("/")
    public String welcomemessage() {
      return ("welcome to my world springboot");
  }
  @GetMapping("/getDate")
      public Date getData(){
      return new Date();
  }

  @GetMapping("/getDate/background")
   public void background() {

              JFrame frame = new JFrame();
      frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
      frame.setVisible(true);
      frame.setTitle("Example");
      frame.setBackground(Color.BLUE);

  }
}
