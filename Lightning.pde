int startX = 0;
int startY = 0;
int endX = 400;
int endY = 400;

void setup()
{
  size(400,400);
  strokeWeight(3);
  background(0, 0, 139);
}

void draw()
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

void mousePressed()
{
  startX = 0;
  startY = 0;
  endX = 400;
  endY = 400;
}