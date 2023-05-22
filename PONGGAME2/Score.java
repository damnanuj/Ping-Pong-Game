import java.awt.*;

public class Score extends Rectangle {
    int width;
    int height;
    int player1;
    int player2;
    Score(int width,int height)
    {
        this.height=height;
        this.width=width;

    }
    public void draw(Graphics g)
    {
        g.setColor(Color.white);
        g.setFont(new Font("Consolas",Font.PLAIN,20));
        g.drawString("Player 1", width/2-100, 20);

        g.setFont(new Font("Consolas",Font.PLAIN,60));
        g.drawString(String.valueOf(player1),width/2-60,100);

        g.setFont(new Font("Consolas",Font.PLAIN,20));
        g.drawString("Player 2", width/2+20, 20);

        g.setFont(new Font("Consolas",Font.PLAIN,60));
        g.drawString(String.valueOf(player2),width/2+20,100);
    }

}
