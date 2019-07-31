package com.ahmedco.bridge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import com.ahmedco.bridge.example2.ITV;
import com.ahmedco.bridge.example2.LogitechRemoteControl;
import com.ahmedco.bridge.example2.SonyTV;
import com.ahmedco.bridge.example3.GreenColor;
import com.ahmedco.bridge.example3.Pentagon;
import com.ahmedco.bridge.example3.RedColor;
import com.ahmedco.bridge.example3.Triangle;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Example1();
        // Example2();
        // Example3();
    }

    private void Example3() {
        // http://www.peru-software.com/aula/pluginfile.php/799/mod_resource/content/1/Java_Design_Pattern_eBook.pdf
       // Shape tri = new Triangle(new RedColor());
       // tri.applyColor();
       // Shape pent = new Pentagon(new GreenColor());
       // pent.applyColor();
    }


    private void Example2(){
      //https://www.programcreek.com/2011/10/java-design-pattern-bridge/

      ITV tv = new SonyTV();
      LogitechRemoteControl lrc = new LogitechRemoteControl(tv);
      lrc.setChannelKeyboard(100);

    }

    private void Example1(){
      //  https://www.tutorialspoint.com/design_pattern/bridge_pattern
     // Shape redCircle = new Circle(100,100, 10, new RedCircle());
      //Shape greenCircle = new Circle(100,100, 10, new GreenCircle());
      //redCircle.draw();
      // greenCircle.draw();
    }


   
}
