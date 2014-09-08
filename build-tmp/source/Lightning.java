import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int startX = 0;
int startY = 0;
int endX = 400;
int endY = 400;

public void setup()
{
  size(400,400);
  strokeWeight(3);
  background(0, 0, 139);
}

public void draw()
{
  stroke((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
  while(endX < 405) 
  {
    endX = startX + (int)(Math.random() * 9);
    endY = startY + (int)(Math.random() * 9);
    line(startX, startY, endX, endY);
    startX = endX;
    startY = endY;
  }
}

public void mousePressed()
{
  startX = 0;
  startY = 0;
  endX = 400;
  endY = 400;
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
