import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component; 



class Bruh extends Component implements ActionListener {

	// dodajemy punkty X dla T
    private final int pointsBruvX_T[][] = {
    		{305,333,547,612},
    		{305,380,600,612},
    		{450,425,496,372},
    		{481,439,557,379},
    		{377,362,359,379}
    };
    // dodajemy punkty X dla K
    private final int pointsBruvX_K[][] = {
    		{697,858,632,675},
    		{736,871,701,712},
    		{736,722,687,698},
    		{712,713,681,674},
    		{915,850,874,785},
    		{915,901,923,774},
    		{901,914,844,823},
    		{901,867,799,775} 
        };
	// dodajemy punkty X dla reverse T 
    private final int pointsBruvX_R_T[][] = {
    		{1250-305,1250-333,1250-547,1250-612},
    		{1250-305,1250-380,1250-600,1250-612},
    		{1250-450,1250-425,1250-496,1250-372},
    		{1250-481,1250-439,1250-557,1250-379},
    		{1250-377,1250-362,1250-359,1250-379}
    };
    // dodajemy punkty X dla reverse K 
    private final int pointsBruvX_R_K[][] = {
    		{1250-697,1250-858,1250-632,1250-675},
    		{1250-736,1250-871,1250-701,1250-712},
    		{1250-736,1250-722,1250-687,1250-698},
    		{1250-712,1250-713,1250-681,1250-674},
    		{1250-915,1250-850,1250-874,1250-785},
    		{1250-915,1250-901,1250-923,1250-774},
    		{1250-901,1250-914,1250-844,1250-823},
    		{1250-901,1250-867,1250-799,1250-775} 
        };
    // dodajemy punkty Y dla T
    private final int pointsBruvY_T[][] = {
    		{128,34,137,49},
    		{128,88,176,49},
    		{121,204,287,324},
    		{121,256,299,351},
    		{323,324,353,351}
    };
    // dodajemy punkty Y dla K
    private final int pointsBruvY_K[][] = {
    		{60,221,208,338},
    		{53,210,228,333},
    		{53,21,49,60},
    		{333,349,362,335},
    		{39,43,193,137},
    		{39,83,198,203},
    		{343,241,248,196},
    		{343,262,276,203} 
    };
    // dodajemy punkty Y dla reverse T 
    private final int pointsBruvY_R_T[][] = {
    		{704-128,704-34,704-137,704-49},
    		{704-128,704-88,704-176,704-49},
    		{704-121,704-204,704-287,704-324},
    		{704-121,704-256,704-299,704-351},
    		{704-323,704-324,704-353,704-351}
    };
    // dodajemy punkty Y dla reverse K
    private final int pointsBruvY_R_K[][] = {
    		{704-60,704-221,704-208,704-338},
    		{704-53,704-210,704-228,704-333},
    		{704-53,704-21,704-49,704-60},
    		{704-333,704-349,704-362,704-335},
    		{704-39,704-43,704-193,704-137},
    		{704-39,704-83,704-198,704-203},
    		{704-343,704-241,704-248,704-196},
    		{704-343,704-262,704-276,704-203} 
    };

    public void paint(Graphics g) {

    	
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                             RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setRenderingHint(RenderingHints.KEY_RENDERING,
                             RenderingHints.VALUE_RENDER_QUALITY);
        
        //ustawiamy kolor dla inicjala T
        g.setColor(Color.RED);
       
        //rysujemy pixeli dla inicjala T t razy dla kazdego punkta k-(0,1,2,3)
        for (int k = 0; k < pointsBruvX_T.length; k++){
        	for (double t=0.0; t<=1.0; t+=0.0005){
    		double tx=(1-t)*(1-t)*(1-t)*pointsBruvX_T[k][0]+3*t*(1-t)*(1-t)*pointsBruvX_T[k][1]+3*t*t*(1-t)*pointsBruvX_T[k][2]+t*t*t*pointsBruvX_T[k][3];
    		double ty=(1-t)*(1-t)*(1-t)*pointsBruvY_T[k][0]+3*t*(1-t)*(1-t)*pointsBruvY_T[k][1]+3*t*t*(1-t)*pointsBruvY_T[k][2]+t*t*t*pointsBruvY_T[k][3];
    		int px = (int) tx;
    		int py = (int) ty;
    		g.drawLine(px,py,px,py);
    		}
    	}
       //ustawiamy kolor dla inicjala K
        g.setColor(Color.GREEN);
        
        //rysujemy pixeli dla inicjala K t razy dla kazdego punkta k-(0,1,2,3)
        for (int k = 0; k < pointsBruvX_K.length; k++){
        	for (double t=0.0; t<=1.0; t+=0.0005){
    		double tx=(1-t)*(1-t)*(1-t)*pointsBruvX_K[k][0]+3*t*(1-t)*(1-t)*pointsBruvX_K[k][1]+3*t*t*(1-t)*pointsBruvX_K[k][2]+t*t*t*pointsBruvX_K[k][3];
    		double ty=(1-t)*(1-t)*(1-t)*pointsBruvY_K[k][0]+3*t*(1-t)*(1-t)*pointsBruvY_K[k][1]+3*t*t*(1-t)*pointsBruvY_K[k][2]+t*t*t*pointsBruvY_K[k][3];
    		int px = (int) tx;
    		int py = (int) ty;
    		g.drawLine(px,py,px,py);
    		}
    	}
        
        //ustawiamy kolor dla inicjala reverse T
        g.setColor(Color.BLUE);
        
        //rysujemy pixeli dla inicjala reverse T t razy dla kazdego punkta k-(0,1,2,3)
        for (int k = 0; k < pointsBruvX_R_T.length; k++){
        	for (double t=0.0; t<=1.0; t+=0.0005){
    		double tx=(1-t)*(1-t)*(1-t)*pointsBruvX_R_T[k][0]+3*t*(1-t)*(1-t)*pointsBruvX_R_T[k][1]+3*t*t*(1-t)*pointsBruvX_R_T[k][2]+t*t*t*pointsBruvX_R_T[k][3];
    		double ty=(1-t)*(1-t)*(1-t)*pointsBruvY_R_T[k][0]+3*t*(1-t)*(1-t)*pointsBruvY_R_T[k][1]+3*t*t*(1-t)*pointsBruvY_R_T[k][2]+t*t*t*pointsBruvY_R_T[k][3];
    		int px = (int) tx;
    		int py = (int) ty;
    		g.drawLine(px,py,px,py);
    		}
    	} 
        
        //ustawiamy kolor dla inicjala reverse K
        g.setColor(Color.ORANGE);
        
        //rysujemy pixeli dla inicjala reverse K t razy dla kazdego punkta k-(0,1,2,3)
        for (int k = 0; k < pointsBruvX_R_K.length; k++){
        	for (double t=0.0; t<=1.0; t+=0.0005){
    		double tx=(1-t)*(1-t)*(1-t)*pointsBruvX_R_K[k][0]+3*t*(1-t)*(1-t)*pointsBruvX_R_K[k][1]+3*t*t*(1-t)*pointsBruvX_R_K[k][2]+t*t*t*pointsBruvX_R_K[k][3];
    		double ty=(1-t)*(1-t)*(1-t)*pointsBruvY_R_K[k][0]+3*t*(1-t)*(1-t)*pointsBruvY_R_K[k][1]+3*t*t*(1-t)*pointsBruvY_R_K[k][2]+t*t*t*pointsBruvY_R_K[k][3];
    		int px = (int) tx;
    		int py = (int) ty;
    		g.drawLine(px,py,px,py);
    		}
    	} 
        g2d.dispose();
    }
    
	@Override
	public void actionPerformed(ActionEvent arg0) {
		repaint();
	}
	
}

public class Bruv extends JFrame {
    
    public Bruv() {

        initUI();
    }    
    
    // dodajmy okno dla rysowania inicjalow i ustawiamy rozmiar okna
    private void initUI() {
    
        add(new Bruh());
        setTitle("Bruv");
        setSize(1280, 800);
        setLocationRelativeTo(null);           
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                Bruv ex = new Bruv();
                ex.setVisible(true);
            }
        });
    }    
}