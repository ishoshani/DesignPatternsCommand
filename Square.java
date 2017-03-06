import java.awt.*;

class Square{
  private int topleftx;
  private int toplefty;
  private double rotation;
  private Color color;
  private int sideLength;
  public Square(){
    topleftx=30;
    toplefty=40;
    rotation=0;
    color = Color.black;
    sideLength= 50;
  }
  public void setColor(Color color){
    this.color = color;
  }
  public Color getColor(){
    return this.color;
  }
  public void rotate(double rads){
    this.rotation+=rads;
  }
  public void translate(int x, int y){
    this.topleftx+=x;
    this.toplefty+=y;
  }
  public void paint(Graphics g){
    double cosLen = sideLength * Math.cos(rotation);
    double sinLen = sideLength * Math.sin(rotation);
    int[] xArray = new int[4];
    int[] yArray = new int[4];
    xArray[0] = topleftx;
    yArray[0] = toplefty;
    xArray[1] = (int)(topleftx+cosLen);
    yArray[1] = (int)(toplefty+sinLen);
    xArray[2] = (int)(xArray[1]-sinLen);
    yArray[2] = (int)(yArray[1]+cosLen);
    xArray[3] = (int)(topleftx-sinLen);
    yArray[3] = (int)(toplefty+cosLen);
    g.setColor(color);
    g.fillPolygon(xArray,yArray,4);
    g.setColor(Color.black);
    g.drawPolygon(xArray,yArray,4);
  }
}
