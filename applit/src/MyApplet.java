import   java.applet.*;
import  java.awt.*;
public class MyApplet extends Applet
{
    public  void  paint(Graphics   g)
    {
        Color   c = new  Color(215,175, 100);
        g.setColor(c);
        g.fillRoundRect(20,20,100,100,10,10);
    }
}
/*
<applet   code=MyApplet.class   width=400   height = 400>
</applet>
*/
