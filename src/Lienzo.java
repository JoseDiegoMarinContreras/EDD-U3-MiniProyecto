
import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class Lienzo extends Canvas{
    ListaDoblePrioridad lp;
    
    Lienzo(int ancho,int alto,ListaDoblePrioridad l){
        lp = l;
        setSize(ancho,alto);
        setBackground(Color.WHITE);
    }
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        g.setFont(new Font("Tahoma",Font.BOLD,16));
        int rval,gval,bval;
        int x=78,y=10,counter = -1;
        for(NodoDoblePrioridad temp = lp.ini;temp !=null;temp = temp.sig){
            if(counter == 4){
                g.setFont(new Font("Tahoma",Font.PLAIN,26));
                g.drawString(" ... ", x-12, y+75); 
                y += 240; 
                x = 78;
                counter = -1;
                g.drawString("...", 0, y+75);
                g.setFont(new Font("Tahoma",Font.BOLD,16));}
            rval = (int)Math.floor(Math.random()*256);
            gval=(int)Math.floor(Math.random()*256);
           bval = (int)Math.floor(Math.random()*256);
         if(lp.soloUnElemento()){
         g.setColor(new Color(rval,gval,bval));
        g.fillOval(x, y, 180, 180);
        g2.setStroke(new BasicStroke(2));
        g.setColor(Color.BLACK);
        g.drawString("Inicio.", x, y+5);
        g.drawString("Fin.", x+150, y+5);
        g.drawString("Valor: "+temp.valor, x+20, y+60);
        g.drawString("Prioridad: "+temp.prioridad, x+20, y+80);
        g.drawOval(x, y, 180, 180);
        g.drawLine(x+90, y+135, x+90, y+180);
        g.drawLine(x+12,y+135,x+170,y+135);
        g2.setStroke(new BasicStroke(3));
            //ant
        g.drawLine(x+60,y+155,x+60,y+210);
        g.drawLine(x+25,y+210,x+95,y+210);
        g.drawLine(x+25,y+220,x+95,y+220);
            //sig
        g.drawLine(x+120, y+155, x+120, y+210);
        g.drawLine(x+85, y+210, x+155, y+210);
        g.drawLine(x+85, y+220, x+155, y+220);
         }else if(temp == lp.ini){    
        //Ini
        g.setColor(new Color(rval,gval,bval));
        g.fillOval(x, y, 180, 180);
        g2.setStroke(new BasicStroke(2));
        g.setColor(Color.BLACK);
        g.drawString("Inicio.", x, y+5);
        g.drawString("Valor: "+temp.valor, x+20, y+60);
        g.drawString("Prioridad: "+temp.prioridad, x+20, y+80);
        g.drawOval(x, y, 180, 180);
        g.drawLine(x+90, y+135, x+90, y+180);
        g.drawLine(x+12,y+135,x+170,y+135);
        g2.setStroke(new BasicStroke(3));
            //sig
        g.drawLine(x+120,y+155,x+235,y+75);
        g.drawLine(x+235,y+75,x+235,y+90);
        g.drawLine(x+235,y+75,x+220,y+75);
            //ant
        g.drawLine(x+60,y+155,x+60,y+210);
        g.drawLine(x+25,y+210,x+95,y+210);
        g.drawLine(x+25,y+220,x+95,y+220);
        x+=240;
        counter++;}else if(temp == lp.fin){
        //Fin
        g.setColor(new Color(rval,gval,bval));
        g.fillOval(x, y, 180, 180);
        g.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(2));
        g.drawOval(x, y, 180, 180);
        g.drawString("Fin.", x+150, y+5);
        g.drawString("Valor: "+temp.valor, x+20, y+60);
        g.drawString("Prioridad: "+temp.prioridad, x+20, y+80);
        g.drawLine(x+90, y+135, x+90, y+180);
        g.drawLine(x+12,y+135,x+170,y+135);
        g2.setStroke(new BasicStroke(3));
            //sig
        g.drawLine(x+120, y+155, x+120, y+210);
        g.drawLine(x+85, y+210, x+155, y+210);
        g.drawLine(x+85, y+220, x+155, y+220);
            //ant.
        g.drawLine(x+60,y+155,x-55,y+75);
        g.drawLine(x-55,y+75,x-40,y+75);
        g.drawLine(x-55,y+75,x-55,y+90);
        }else{
        //Medio
        g.setColor(new Color(rval,gval,bval));
        g.fillOval(x, y, 180, 180);
        g2.setStroke(new BasicStroke(2));
        g.setColor(Color.BLACK);
        g.drawOval(x, y, 180, 180);
        g.drawString("Valor: "+temp.valor, x+20, y+60);
        g.drawString("Prioridad: "+temp.prioridad, x+20, y+80);
        g.drawLine(x+90, y+135, x+90, y+180);
        g.drawLine(x+12,y+135,x+170,y+135);
        g2.setStroke(new BasicStroke(3));
            //sig.
        g.drawLine(x+120,y+155,x+235,y+75);
        g.drawLine(x+235,y+75,x+235,y+90);
        g.drawLine(x+235,y+75,x+220,y+75);
            //ant.
        g.drawLine(x+60,y+155,x-55,y+75);
        g.drawLine(x-55,y+75,x-40,y+75);
        g.drawLine(x-55,y+75,x-55,y+90);
        x+=240;
        counter++;
        }
    }
    }
}
